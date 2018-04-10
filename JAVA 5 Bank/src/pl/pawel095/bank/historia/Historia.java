package pl.pawel095.bank.historia;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

import pl.pawel095.bank.Konto;
import pl.pawel095.bank.historia.Operacja.TYP;

public class Historia {
	private ArrayList<Operacja> historiaOperacji = new ArrayList<Operacja>();

	public void Przelew(Konto zKonta, Konto naKonto, int ilosc) {
		if (zKonta.przelewam(naKonto, ilosc)) {
			historiaOperacji.add(new Operacja(TYP.PRZELEW, ilosc, zKonta.getNumerKonta(), naKonto.getNumerKonta()));
		}
	}

	public void Wplata(Konto konto, int ile) {
		konto.wplacam(ile);
		historiaOperacji.add(new Operacja(TYP.WYPLATA, ile, konto.getNumerKonta()));
	}

	public void Wyplata(Konto konto, int ile) {
		if (konto.wyplacam(ile)) {
			historiaOperacji.add(new Operacja(TYP.WYPLATA, ile, konto.getNumerKonta()));
		}
	}

	public ArrayList<Operacja> historiaKonta(Konto a) {
		ArrayList<Operacja> ret = new ArrayList<Operacja>();
		for (Operacja operacja : historiaOperacji) {
			if (operacja.getPrzelewWplataWyplata_ZKontaNr().equals(a.getNumerKonta())) {
				ret.add(operacja);
			}else if (operacja.getPrzelewNaKontoNr()!=null && operacja.getPrzelewNaKontoNr().equals(a.getNumerKonta())) {
				ret.add(operacja);
			}
		}
		return ret;
	}

}

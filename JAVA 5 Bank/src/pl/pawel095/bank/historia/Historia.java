package pl.pawel095.bank.historia;

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
		for (Operacja o : historiaOperacji) {
			if (o.getPrzelewWplataWyplata_ZKontaNr().equals(a.getNumerKonta())) {
				ret.add(o);
			}else if (o.getPrzelewNaKontoNr()!=null && o.getPrzelewNaKontoNr().equals(a.getNumerKonta())) {
				ret.add(o);
			}
		}
		return ret;
	}
}

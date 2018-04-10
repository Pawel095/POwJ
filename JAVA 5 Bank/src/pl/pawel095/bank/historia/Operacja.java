package pl.pawel095.bank.historia;

import java.util.Date;

public class Operacja {
	public enum TYP {
		PRZELEW, WYPLATA, WPLATA
	}

	public TYP typOperacji;
	public String przelewZKontaNr;
	public String przelewNaKontoNr;
	public int kwotaOperacji;
	public Date dataOperacji;

	public TYP getTypOperacji() {
		return typOperacji;
	}

	public String getPrzelewZKontaNr() {
		return przelewZKontaNr;
	}

	public String getPrzelewNaKontoNr() {
		return przelewNaKontoNr;
	}

	public int getKwotaOperacji() {
		return kwotaOperacji;
	}

	public Date getDataOperacji() {
		return dataOperacji;
	}

	public Operacja(TYP typ, int kwotaOperacji, String przelewZKontaNr, String przelewNaKontoNr) {
		this.typOperacji=typ;
		this.kwotaOperacji=kwotaOperacji;
		this.przelewZKontaNr=przelewZKontaNr;
		this.przelewNaKontoNr=przelewNaKontoNr;
		dataOperacji=new Date();
	}
}

package pl.pawel095.bank.historia;

import java.util.Date;

public class Operacja {
	public enum TYP {
		PRZELEW, WYPLATA, WPLATA
	}

	public TYP typOperacji;
	public String przelewWplataWyplata_ZKontaNr;
	public String przelewNaKontoNr;
	public String WplataiWyplataNaKontoNr;
	public int kwotaOperacji;
	public Date dataOperacji;

	public TYP getTypOperacji() {
		return typOperacji;
	}

	public String getPrzelewWplataWyplata_ZKontaNr() {
		return przelewWplataWyplata_ZKontaNr;
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
		this.typOperacji = typ;
		this.kwotaOperacji = kwotaOperacji;
		this.przelewWplataWyplata_ZKontaNr = przelewZKontaNr;
		this.przelewNaKontoNr = przelewNaKontoNr;
		dataOperacji = new Date();
	}

	public Operacja(TYP typ, int kwotaOperacji, String konto) {
		this.typOperacji = typ;
		this.kwotaOperacji = kwotaOperacji;
		this.przelewWplataWyplata_ZKontaNr = null;
		this.przelewNaKontoNr = null;
		dataOperacji = new Date();
	}
}

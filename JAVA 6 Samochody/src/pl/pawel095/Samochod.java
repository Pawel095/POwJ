package pl.pawel095;

import java.util.Date;

public class Samochod {
	private double cena;
	private String tytul;
	private Date dataOgloszenia;
	private int rocznik;
	private long przebieg;
	
	
	public Samochod(Double cena, String tytul, Date dataOgloszenia, int rocznik, long przebieg) {
		this.cena = cena;
		this.tytul = tytul;
		this.dataOgloszenia = dataOgloszenia;
		this.rocznik = rocznik;
		this.przebieg = przebieg;
	}

	@Override
	public String toString() {
		String ret = "Cena " + Double.toString(cena) + " tytul " + tytul + " Data Ogloszenia " + dataOgloszenia.toString()
				+ " rocznik " + Integer.toString(rocznik) + " przebieg " + Long.toString(przebieg);
		return ret;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(Double cena) {
		this.cena = cena;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public Date getDataOgloszenia() {
		return dataOgloszenia;
	}

	public void setDataOgloszenia(Date dataOgloszenia) {
		this.dataOgloszenia = dataOgloszenia;
	}

	public int getRocznik() {
		return rocznik;
	}

	public void setRocznik(int rocznik) {
		this.rocznik = rocznik;
	}

	public long getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(long przebieg) {
		this.przebieg = przebieg;
	}

}

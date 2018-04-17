package pl.pawel095.filter;

import java.util.ArrayList;
import java.util.Date;

import pl.pawel095.Samochod;

public interface FiltrOfert {
	public ArrayList<Samochod> getPoCenie(double min, double max);

	public ArrayList<Samochod> getPoTytule(String tytul);

	public ArrayList<Samochod> getPoDacie(Date min, Date max);

	public ArrayList<Samochod> getPoRoczniku(int min, int max);

	public ArrayList<Samochod> getPoPrzebiegu(int min, int max);
}

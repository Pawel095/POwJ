package pl.pawel095;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		OfertyFilter of=new OfertyFilter();
		of.addOferta(new Samochod(123.0, "sprzedam opla", new Date(), 1991, 123));
		of.addOferta(new Samochod(19999.9, "Nowy Bentley na sprzedaz", new Date(), 2018, 0));
		of.addOferta(new Samochod(123.4, "niemiec plakal jak Fiata sprzedawal", new Date(), 3, 2000000000));
		System.out.println(of.getPoCenie(123.0, 200000.0).toString());
		
		OfertySorter os=new OfertySorter();
		os.addOferta(new Samochod(123.0, "sprzedam opla", new Date(), 1991, 123));
		os.addOferta(new Samochod(19999.9, "Nowy Bentley na sprzedaz", new Date(), 2018, 0));
		os.addOferta(new Samochod(123.4, "niemiec plakal jak Fiata sprzedawal", new Date(), 3, 2000000000));
		System.out.println(os.getListaOgloszen().toString());
		os.sortPoCenie();
		System.out.println(os.getListaOgloszen().toString());
		
	}

}

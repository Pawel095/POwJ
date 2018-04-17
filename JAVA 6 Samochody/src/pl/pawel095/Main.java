package pl.pawel095;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oferty o=new Oferty();
		o.addOferta(new Samochod(123.0, "sprzedam opla", new Date(), 1991, 123));
		o.addOferta(new Samochod(19999.9, "Nowy Bentley na sprzedaz", new Date(), 2018, 0));
		o.addOferta(new Samochod(123.4, "niemiec plakal jak Fiata sprzedawal", new Date(), 3, 2000000000));
		System.out.println(o.getPoCenie(123.0, 200000.0).toString());
		
	}

}

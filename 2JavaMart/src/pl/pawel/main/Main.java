package pl.pawel.main;

public class Main {

	public static void main(String[] args) {
		Product[] produkty = new Product[3];
		produkty[0] = new Product("0001", "Nihongo For Bakas", 200.00);
		produkty[1] = new Product("0002", "Magiczne kuchnie świata", 29.99);
		produkty[2] = new Product("0003", "Java od Podstaw", 101.99);

		Koszyk k = new Koszyk();
		k.addProduct(produkty[0]);
		k.addProduct(produkty[1]);
		k.addProduct(produkty[2]);
		System.out.println("2 NAJDROŻSZE: "+k.getN_Najdrozszych(2).get(0).getCena()+" "+ k.getN_Najdrozszych(2).get(1).getCena());
		System.out.println("2 NAJTAŃSZE: "+k.getN_Najtanszych(2).get(0).getCena()+" "+ k.getN_Najtanszych(2).get(1).getCena());
		k.wypisz();
		k.sortPoCenie();
		k.wypisz();
		System.out.println(k.policzCene(null));
		
	}
}

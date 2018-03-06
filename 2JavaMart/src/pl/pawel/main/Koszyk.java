package pl.pawel.main;

import java.util.ArrayList;

public class Koszyk {
	private ArrayList<Product> produkty = new ArrayList<Product>();

	public Koszyk() {
	}

	public void addProduct(Product p) {
		produkty.add(p);
	}

	public Product getNajtanszy() {
		Product ret = produkty.get(0);
		for (int i = 1; i < produkty.size(); i++) {
			if (produkty.get(i).getCena() < ret.getCena()) {
				ret = produkty.get(i);
			}
		}
		return ret;
	}

	public Product getNajdrozszy() {
		Product ret = produkty.get(0);
		for (int i = 1; i < produkty.size(); i++) {
			if (produkty.get(i).getCena() > ret.getCena()) {
				ret = produkty.get(i);
			}
		}
		return ret;
	}
}

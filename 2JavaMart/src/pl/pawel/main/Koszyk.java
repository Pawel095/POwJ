package pl.pawel.main;

import java.util.ArrayList;

public class Koszyk {
	private ArrayList<Product> produkty = new ArrayList<Product>();

	public Koszyk() {
	}

	public void addProduct(Product p) {
		produkty.add(p);
	}

	private Product getNajtanszy() {
		Product ret = produkty.get(0);
		for (int i = 1; i < produkty.size(); i++) {
			if (produkty.get(i).getCena() < ret.getCena()) {
				ret = produkty.get(i);
			}
		}
		return ret;
	}

	private Product getNajdrozszy() {
		Product ret = produkty.get(0);
		for (int i = 1; i < produkty.size(); i++) {
			if (produkty.get(i).getCena() > ret.getCena()) {
				ret = produkty.get(i);
			}
		}
		return ret;
	}

	public ArrayList<Product> getN_Najtanszych(int n) {
		ArrayList<Product> ret = new ArrayList<Product>();
		ret.add(getNajtanszy());
		Product temp = getNajdrozszy();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < produkty.size(); j++) {
				if (!ret.contains(produkty.get(j))) {
					if (produkty.get(j).getCena() < temp.getCena()) {
						temp = produkty.get(j);
					}
				}
			}
			ret.add(temp);
			temp = getNajdrozszy();
		}
		return ret;
	}
	public ArrayList<Product> getN_Najdrozszych(int n) {
		ArrayList<Product> ret = new ArrayList<Product>();
		ret.add(getNajdrozszy());
		Product temp=getNajtanszy();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < produkty.size(); j++) {
				if (!ret.contains(produkty.get(j))) {
					if (produkty.get(j).getCena() > temp.getCena()) {
						temp=produkty.get(j);
					}
				}
			}
			ret.add(temp);
			temp=getNajtanszy();
		}

		return ret;
	}

}

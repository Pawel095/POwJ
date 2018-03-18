package pl.pawel.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

	public Product getProduct(int index) {
		return produkty.get(index);
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
		Product temp = getNajtanszy();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < produkty.size(); j++) {
				if (!ret.contains(produkty.get(j))) {
					if (produkty.get(j).getCena() > temp.getCena()) {
						temp = produkty.get(j);
					}
				}
			}
			ret.add(temp);
			temp = getNajtanszy();
		}

		return ret;
	}

	public void sortPoNazwie() {
		Collections.sort(produkty, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	public void sortPoCenie() {
		Collections.sort(produkty, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getCena() < o2.getCena()) {
					return -1;
				} else if (o1.getCena() == o2.getCena()) {
					return 0;
				}
				return 1;
			}
		});
	}
	public double policzCene(ArrayList<Product> p) {
		double ret=0;
		if (p == null) {
			for (Product product : produkty) {
				ret+=product.getCena();
			}
		}else {
			for (Product product : p) {
				ret+=product.getCena();
			}
		}
		return ret;
			
	}
	public void promocje() {
		if (policzCene(produkty)>300) {
			System.out.println("Mam 5% zniżki!");
		}
		if (produkty.size()==2) {
			System.out.println(getNajtanszy().getName()+" Dostajesz za Darmo!");
		}
		if (policzCene(produkty)>200) {
			System.out.println("Firmowy kubek gratis!");
		}
	}

	public void wypisz() {
		for (int i = 0; i < produkty.size(); i++) {
			System.out.println("KOD: " + produkty.get(i).getCode() + " NAZWA: " + produkty.get(i).getName() + " CENA: "
					+ produkty.get(i).getCena());
		}
	}
}

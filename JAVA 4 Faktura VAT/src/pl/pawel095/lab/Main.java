package pl.pawel095.lab;

import pl.pawel095.lab.model.Product;

public class Main {

	public static void main(String[] args) {
		Product p=new Product("ABC123","TV",1234.5);
		System.out.println(p.toString());
	}
}

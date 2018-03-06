package pl.pawel.main;

public class Product {

	private String code;
	private String name;
	private double cena;
	private double discountPrice;

	public Product(String code, String name, double cena) {
		this.setCena(cena);
		this.setName(name);
		this.setCode(code);
		discountPrice = 0.95 * cena;
	}

	public Product() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
		discountPrice = 0.95 * cena;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}
}

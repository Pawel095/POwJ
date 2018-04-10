package pl.pawel095.lab.model;

public class Product {
	private String code;
	private String name;
	private double price;
	@Override
	public String toString() {
		String ret;
		ret=code+" "+name+" "+String.valueOf(price);
		return ret;
	}
	public Product(String code,String name,double price) {
		this.name=name;
		this.code=code;
		this.price=price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

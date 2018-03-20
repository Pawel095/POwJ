package pl.pawel.lab;

public class Main {
	public static void main(String[] args) {
		Aplikant a=new Aplikant();
		System.out.println(a.toString());
		a.setFirstName("Pawel");
		a.setSurname("Pankiewicz");
		a.setPesel("97102603235");
		a.setNip("1234563218");
		System.out.println(a.toString());
	}
	
}

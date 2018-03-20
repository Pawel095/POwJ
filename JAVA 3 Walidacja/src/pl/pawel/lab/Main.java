package pl.pawel.lab;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import pl.pawel.lab.Aplikant.Gender;

public class Main {
	public static void main(String[] args) {
		Aplikant a=new Aplikant();
		a.setFirstName("Pawel");
		a.setSurname("Pankiewicz");
		a.setPesel("97102603235");
		a.setNip("1234563218");
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY/MM/DD");
		try {
			a.setDateOfBirth(sdf.parse("1997/10/26"));
		} catch (ParseException e) {
			System.err.println("Błąd parsowania daty");
			e.printStackTrace();
		}
		a.setGender(Gender.M);
		System.out.println(a.toString());
	}
	
}

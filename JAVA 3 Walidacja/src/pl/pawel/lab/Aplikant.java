package pl.pawel.lab;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplikant {
	private String firstName;
	private String surname;
	private String pesel;
	private String nip;
	private String bankAccountNumber;
	private Date dateOfBirth;
	private String gender;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		Pattern imieP = Pattern.compile("^[A-Z][a-z]+$");
		Matcher m = imieP.matcher(firstName);
		if (firstName == null || firstName.length() < 1 || !m.matches()) {
			return;
		}

		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		Pattern nazwiskoP = Pattern.compile("^[A-Z][a-z]+$");
		Matcher m = nazwiskoP.matcher(firstName);
		if (firstName == null || firstName.length() < 1 || !m.matches()) {
			return;
		}
		this.surname = surname;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		Pattern p=Pattern.compile("^[0-9]{11}$");
		Matcher m=p.matcher(pesel);
		int kontrolna=0;
		int[] wielomian= {9,7,3,1,9,7,3,1,9,7};
		
		for (int i = 0; i < wielomian.length; i++) {
			kontrolna+=wielomian[i]*Character.getNumericValue(pesel.toCharArray()[i]);
		}
		
		if (!m.matches() || kontrolna%10!=Character.getNumericValue(pesel.toCharArray()[pesel.length()-1])) {
			return;
		}
		this.pesel = pesel;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		
		this.nip = nip;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

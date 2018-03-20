package pl.pawel.lab;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplikant {
	public enum Gender {
		M, F, UNDEFINED;
		@Override
		public String toString() {
			if (this == F) {
				return "F";
			} else {
				return "M";
			}
		}
	}

	private ArrayList<Integer> peselData = new ArrayList<Integer>();

	private String firstName = "";
	private String surname = "";
	private String pesel = "";
	private String nip = "";
	private String bankAccountNumber = "";
	private Date dateOfBirth = new Date();
	private Gender gender = Gender.UNDEFINED;

	@Override
	public String toString() {
		return firstName + " " + surname + " " + pesel + " " + nip + " " + bankAccountNumber + " "
				+ dateOfBirth.toString() + " " + gender.toString();
	}

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
		Pattern p = Pattern.compile("^[0-9]{11}$");
		Matcher m = p.matcher(pesel);
		int kontrolna = 0;
		int[] wielomian = { 9, 7, 3, 1, 9, 7, 3, 1, 9, 7 };

		for (int i = 0; i < wielomian.length; i++) {
			kontrolna += wielomian[i] * Character.getNumericValue(pesel.toCharArray()[i]);
		}

		if (!m.matches() || kontrolna % 10 != Character.getNumericValue(pesel.toCharArray()[pesel.length() - 1])) {
			return;
		}

		this.pesel = pesel;

		if (Integer.parseInt(pesel.substring(2, 4)) < 20) {
			peselData.add(Integer.parseInt("19" + pesel.substring(0, 2)));
			peselData.add(Integer.parseInt(pesel.substring(2, 4)));
		} else if (Integer.parseInt(pesel.substring(2, 4)) < 40) {
			peselData.add(Integer.parseInt("20" + pesel.substring(0, 2)));
			peselData.add(Integer.parseInt(pesel.substring(2, 4)) - 20);
		} else if (Integer.parseInt(pesel.substring(2, 4)) < 60) {
			peselData.add(Integer.parseInt("21" + pesel.substring(0, 2)));
			peselData.add(Integer.parseInt(pesel.substring(2, 4)) - 40);
		} else if (Integer.parseInt(pesel.substring(2, 4)) < 80) {
			peselData.add(Integer.parseInt("22" + pesel.substring(0, 2)));
			peselData.add(Integer.parseInt(pesel.substring(2, 4)) - 60);
		} else {
			peselData.add(Integer.parseInt("18" + pesel.substring(0, 2)));
			peselData.add(Integer.parseInt(pesel.substring(2, 4)) - 60);
		}

	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		Pattern p = Pattern.compile("^[0-9]{10}$");
		Matcher m = p.matcher(nip);
		int kontrolna = 0;
		int[] wielomian = { 6, 5, 7, 2, 3, 4, 5, 6, 7 };

		for (int i = 0; i < wielomian.length; i++) {
			kontrolna += wielomian[i] * Character.getNumericValue(pesel.toCharArray()[i]);
		}

		if (!m.matches() || kontrolna % 10 != Character.getNumericValue(nip.toCharArray()[nip.length() - 1])) {
			return;
		}
		this.nip = nip;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		Pattern p = Pattern.compile("^[0-9]{26}$");
		Matcher m = p.matcher(bankAccountNumber);
		if (!m.matches()) {
			return;
		}
		this.bankAccountNumber = bankAccountNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		LocalDate c=dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int y = c.getYear();
		int m = c.getMonthValue();
		int d = c.getDayOfMonth();
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		if (peselData.get(0) == y && peselData.get(1) == m && peselData.get(2) == d) {
			this.dateOfBirth = dateOfBirth;
		}else {
			return;
		}
		
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		if (pesel.toCharArray()[pesel.length() - 2] % 2 == 0 && gender.equals(Gender.F)) {
			this.gender = gender;
		} else if (pesel.toCharArray()[pesel.length() - 2] % 2 == 1 && gender.equals(Gender.M)) {
			this.gender = gender;
		}
	}

}

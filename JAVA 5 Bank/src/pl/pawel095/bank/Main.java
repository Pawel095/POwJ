package pl.pawel095.bank;

import pl.pawel095.bank.historia.Historia;

public class Main {

	public static void main(String[] args) {
		Konto a = new Konto("001");
		Konto b = new Konto("002");
		Historia historiaKont = new Historia();
		historiaKont.Wplata(a, 500);
		historiaKont.Wyplata(a, 100);
		historiaKont.Przelew(a, b, 200);
		System.out.println(historiaKont.historiaKonta(a).toString());
	}

}

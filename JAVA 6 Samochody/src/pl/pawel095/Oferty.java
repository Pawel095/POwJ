package pl.pawel095;

public class Oferty {
	protected ArrayList listaOgloszen = new ArrayList();

	public ArrayList getListaOgloszen() {
		return listaOgloszen;
	}

	public void addOferta(Samochod sprzedawany) {
		listaOgloszen.add(sprzedawany);
	}

}

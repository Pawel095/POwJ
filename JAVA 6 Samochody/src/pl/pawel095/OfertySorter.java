package pl.pawel095;

import java.util.Comparator;

import pl.pawel095.sorter.SorterOfert;

public class OfertySorter extends Oferty implements SorterOfert {

	@Override
	public void sortPoCenie() {
		listaOgloszen.sort(new Comparator<Samochod>() {
			@Override
			public int compare(Samochod o1, Samochod o2) {
				if (o1.getCena() < o2.getCena())
					return -1;
				else if (o1.getCena() == o2.getCena()) {
					return 0;
				} else {
					return 1;
				}
			}

		});
	}

	@Override
	public void sortPoRoczniku() {
		listaOgloszen.sort(new Comparator<Samochod>() {
			@Override
			public int compare(Samochod o1, Samochod o2) {
				if (o1.getRocznik() < o2.getRocznik())
					return -1;
				else if (o1.getRocznik() == o2.getRocznik()) {
					return 0;
				} else {
					return 1;
				}
			}

		});
	}

	@Override
	public void sortPoDacie() {
		listaOgloszen.sort(new Comparator<Samochod>() {
			@Override
			public int compare(Samochod o1, Samochod o2) {
				if (o1.getDataOgloszenia().before(o2.getDataOgloszenia()))
					return -1;
				else if (o1.getDataOgloszenia().equals(o2.getDataOgloszenia())) {
					return 0;
				} else {
					return 1;
				}
			}

		});

	}

	@Override
	public void sortPoTytule() {
		listaOgloszen.sort(new Comparator<Samochod>() {

			@Override
			public int compare(Samochod o1, Samochod o2) {
				return o1.getTytul().compareToIgnoreCase(o2.getTytul());
			}
		});
	}
}

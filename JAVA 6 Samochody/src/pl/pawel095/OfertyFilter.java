package pl.pawel095;

import java.util.Date;

import pl.pawel095.filter.FiltrOfert;

public class OfertyFilter extends Oferty implements FiltrOfert {
	
	@Override
	public ArrayList getPoCenie(double min, double max) {
		ArrayList ret = new ArrayList();
		if (min <= 0) {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getCena() < max) {
					ret.add(samochod);
				}
			}
		} else if (max <= 0) {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getCena() > min) {
					ret.add(samochod);
				}
			}
		} else {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getCena() < max && samochod.getCena() > min) {
					ret.add(samochod);
				}
			}
		}
		return ret;
	}

	@Override
	public ArrayList getPoTytule(String tytul) {
		ArrayList ret=new ArrayList();
		if (tytul!=null) {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getTytul()==tytul) {
					ret.add(samochod);
				}
			}
		}
		return ret;
	}

	@Override
	public ArrayList getPoDacie(Date min, Date max) {
		ArrayList ret=new ArrayList();
		if (min!=null) {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getDataOgloszenia().before(max)) {
					ret.add(samochod);
				}
			}
		}else if (max!=null) {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getDataOgloszenia().after(min)) {
					ret.add(samochod);
				}
			}
		}else {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getDataOgloszenia().before(max) && samochod.getDataOgloszenia().after(min)) {
					ret.add(samochod);
				}
			}
		}
		return ret;
	}

	@Override
	public ArrayList getPoRoczniku(int min, int max) {
		ArrayList ret = new ArrayList();
		if (min <= 0) {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getCena() < max) {
					ret.add(samochod);
				}
			}
		} else if (max <= 0) {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getCena() > min) {
					ret.add(samochod);
				}
			}
		} else {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getCena() < max && samochod.getCena() > min) {
					ret.add(samochod);
				}
			}
		}
		return ret;
	}

	@Override
	public ArrayList getPoPrzebiegu(int min, int max) {
		ArrayList ret = new ArrayList();
		if (min <= 0) {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getCena() < max) {
					ret.add(samochod);
				}
			}
		} else if (max <= 0) {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getCena() > min) {
					ret.add(samochod);
				}
			}
		} else {
			for (Samochod samochod : listaOgloszen) {
				if (samochod.getCena() < max && samochod.getCena() > min) {
					ret.add(samochod);
				}
			}
		}
		return ret;
	}

}

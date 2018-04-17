package pl.pawel095;

public class ArrayList extends java.util.ArrayList<Samochod>{
	private static final long serialVersionUID = 7850283283913587261L;
	
	@Override
	public String toString() {
		String ret=new String();
		for (Samochod s : this) {
			ret+=" "+s.toString()+"\n";
		}
		return ret;
	}
}

package pl.pawel095.bank;

public class Konto {
	private String numerKonta;
	private int saldo;
	
	public String getNumerKonta() {
		return numerKonta;
	}
	
	public int getSaldo() {
		return saldo;
	}
	public boolean przelewam(Konto docelowe,int ile) {
		if (saldo-ile<0) {
			saldo-=ile;
			docelowe.odbieramPrzelew(ile);
			return true;
		}
		return false;
	}
	
	public void odbieramPrzelew(int ile) {
		saldo+=ile;
	}
	
	public boolean wyplacam(int ile) {
		if (saldo-ile<0) {
			saldo-=ile;
			return true;
		}
		return false;
	}
	public void wplacam(int ile) {
		saldo+=ile;
	}
	
	
	public Konto(String numerKonta) {
		this.numerKonta=numerKonta;
		saldo=0;
	}
}
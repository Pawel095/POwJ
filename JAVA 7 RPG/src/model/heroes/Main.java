package model.heroes;

public class Main {

	public static void main(String[] args) {
		Mage m = new Mage();
		Knight k = new Knight();
		Archer a = new Archer();
		m.setName("Ryuu");
		k.setName("Sakana");
		a.setName("Kuroki");
		for (int i = 0; i < 100; i++) {
			m.levelUp();
			m.raiseAgi();
			m.raiseDef();
			m.raiseDex();
			m.raiseInt();
			m.raiseSpd();
			m.raiseStr();

			k.levelUp();
			k.raiseAgi();
			k.raiseDef();
			k.raiseDex();
			k.raiseInt();
			k.raiseSpd();
			k.raiseStr();

			a.levelUp();
			a.raiseAgi();
			a.raiseDef();
			a.raiseDex();
			a.raiseInt();
			a.raiseSpd();
			a.raiseStr();
		}
		m.printOutHero();
		k.printOutHero();
		a.printOutHero();
	}
}

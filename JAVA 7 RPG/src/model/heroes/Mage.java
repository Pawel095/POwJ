package model.heroes;

public class Mage extends Hero implements ICanBeAHero {

	@Override
	public void printOutHero() {
		System.out.println("--------------------------------------------------------");
		System.out.println(this.toString());
		System.out.println("--------------------------------------------------------");
	}

	@Override
	public String toString() {
		return "Mage [name=" + name + ", strength=" + strength + ", defence=" + defence + ", dexterity=" + dexterity
				+ ", inteligence=" + inteligence + ", agility=" + agility + ", speed=" + speed
				+ ", availableStatPoints=" + availableStatPoints + "]";
	}

	@Override
	protected void modifyStrength() {
		defence++;

	}

	@Override
	protected void modifyDefence() {
		strength++;

	}

	@Override
	protected void modifyIntelligence() {
		inteligence = (int) ((inteligence + 1) / 1.2);
		inteligence++;
		inteligence *= 1.2;

	}

	@Override
	protected void modifyDexterity() {
		dexterity = (int) ((dexterity + 1) / 1.05);
		dexterity++;
		dexterity *= 1.05;

	}

	@Override
	protected void modifyAgility() {
		agility = (int) ((agility + 1) / 1.02);
		agility++;
		agility *= 1.02;

	}

	@Override
	protected void modifySpeed() {
		speed++;

	}

}

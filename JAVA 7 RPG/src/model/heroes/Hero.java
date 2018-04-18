package model.heroes;

public abstract class Hero {
	protected String name;

	protected int strength;
	protected int defence;
	protected int dexterity;
	protected int inteligence;
	protected int agility;
	protected int speed;

	protected int availableStatPoints;

	protected abstract void modifyStrength();

	protected abstract void modifyDefence();

	protected abstract void modifyIntelligence();

	protected abstract void modifyDexterity();

	protected abstract void modifyAgility();

	protected abstract void modifySpeed();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public int getDefence() {
		return defence;
	}

	public int getDexterity() {
		return dexterity;
	}

	public int getInteligence() {
		return inteligence;
	}

	public int getAgility() {
		return agility;
	}

	public int getSpeed() {
		return speed;
	}

	public int getAvailableStatPoints() {
		return availableStatPoints;
	}

	public void raiseDef() {
		if (availableStatPoints <= 0)
			return;
		modifyDefence();
		availableStatPoints--;
	}

	public void raiseStr() {
		if (availableStatPoints <= 0)
			return;
		modifySpeed();
		availableStatPoints--;
	}

	public void raiseSpd() {
		if (availableStatPoints <= 0)
			return;
		modifySpeed();
		availableStatPoints--;
	}

	public void raiseInt() {
		if (availableStatPoints <= 0)
			return;
		modifyIntelligence();
		availableStatPoints--;
	}

	public void raiseDex() {
		if (availableStatPoints <= 0)
			return;
		modifyDexterity();
		availableStatPoints--;
	}

	public void raiseAgi() {
		if (availableStatPoints <= 0)
			return;
		modifyAgility();
		availableStatPoints--;

	}

	public void levelUp() {
		availableStatPoints += 10;
	}
}

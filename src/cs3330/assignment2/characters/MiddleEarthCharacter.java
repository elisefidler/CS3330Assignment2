package cs3330.assignment2.characters;

import cs3330.project2.characters.MiddleEarthCharacter;

public abstract class MiddleEarthCharacter {
	private String name;
	private double health;
	private double power;
	
	/**
	 * Parameterized constructor for MiddleEarthCharacter class.
	 * 
	 *  Initializes variables using user input.
	 *  
	 *  @param name - The character's name
	 *  @param health - The character's health points
	 *  @param power - The character's power level/damage they can do
	 */	
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	/**
	 * Gets character's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets character's name.
	 * 
	 * @param name - The character's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets character's health.
	 */
	public double getHealth() {
		return health;
	}
	
	/**
	 * Sets character's health.
	 * 
	 * @param health - The character's health points
	 */
	public void setHealth(double health) {
		this.health = health;
	}

	/**
	 * Gets character's power.
	 */
	public double getPower() {
		return power;
	}
	
	/**
	 * Sets character's power.
	 * 
	 * @param power - The character's power level/damage they can do
	 */
	public void setPower(double power) {
		this.power = power;
	}
	
	/**
	 * Abstract method simulating attack from current character against target character.
	 * Returns true if attacks reduces target’s health. Returns false if attack
	 * does 0 damage. Characters that are the same race cannot do any damage to each other.
	 *  
	 *  @param target - Character being attacked.
	 */
	abstract boolean attack(MiddleEarthCharacter target);
}

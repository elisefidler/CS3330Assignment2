package cs3330.assignment2.characters;

public class Wizard extends MiddleEarthCharacter {
	
	/**
	 * Parameterized constructor for Wizard class.
	 * 
	 *  Initializes variables using user input.
	 *  
	 *  @param name - The character's name
	 *  @param health - The character's health points
	 *  @param power - The character's power level/damage they can do
	 */
	public Wizard(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Overrides getRace() method. Returns character's race, which is also their class, 
	 * as a string.
	 */
	@Override
	public String getRace() {
		return(this.getClass().getSimpleName());
	}

}

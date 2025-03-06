package cs3330.assignment2.characters;

public class Orc extends MiddleEarthCharacter {
	
	/**
	 * Parameterized constructor for Orc class.
	 * 
	 *  Initializes variables using user input.
	 *  
	 *  @param name - The character's name
	 *  @param health - The character's health points
	 *  @param power - The character's power level/damage they can do
	 */
	public Orc(String name, double health, double power) {
		super(name, health, power);
	}
	
	/**
	 * Overrides getRace() method. Returns character's race, which is also their class, 
	 * as a string.
	 */
	@Override
	public String getRace() {
		return(this.getClass().getSimpleName());
	}
	
	/**
	 * Overrides attack(MiddleEarthCharacter) method. Displays unique attack rule based on
	 * character's race and the race of the character they are attacking. Returns true if 
	 * attacks reduces target’s health. Returns false if attack does 0 damage.
	 * 
	 * @param target - The character being attacked.
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		double hp = target.getHealth();
		double damage = this.getPower();
		String r = target.getRace();
		
		if (r.equals("Elf") || r.equals("Orc")) {
			
			System.out.println(this.getName() + " swung their club too wide at " +  target.getName() + " for 0 damage!");
			
			return false;
		}
		if (r.equals("Human")) {
			
			target.setHealth(hp - (damage*1.5));
			
			System.out.println(this.getName() + "'s attack was super effective! They hit " + target.getName() + " with a mace for " + damage*1.5 + " damage.");
			
			return true;
		}
		else {
			
			target.setHealth(hp - damage);
			
			System.out.println(this.getName() + "'s attack was effective! They hit " + target.getName() + " with a club for " + damage + " damage.");
			
			return true;
		}
	}

}

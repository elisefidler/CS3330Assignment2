package cs3330.assignment2.characters;

public class Elf extends MiddleEarthCharacter {
	
	/**
	 * Parameterized constructor for Elf class.
	 * 
	 *  Initializes variables using user input.
	 *  
	 *  @param name - The character's name
	 *  @param health - The character's health points
	 *  @param power - The character's power level/damage they can do
	 */
	public Elf(String name, double health, double power) {
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
		
		if (r.equals("Elf") || r.equals("Dwarf")) {
			
			System.out.println(this.getName() + " accidently misspoke a spell at " +  target.getName() + " for 0 damage!");
			
			return false;
		}
		if (r.equals("Orc")) {
		     
		    target.setHealth(hp - (damage*1.5));
		    
			System.out.println(this.getName() + "'s attack was super effective! They summoned a hoard of rabid fairies to attack " + target.getName() + " for " + damage*1.5 + " damage.");
		    
			return true;
		}
		else {
			
			target.setHealth(hp - damage);
			
			System.out.println(this.getName() + "'s attack was effective! They conjured a wild beast to attack " + target.getName() + " for " + damage + " damage.");
			
			return true;
		}
	}
}

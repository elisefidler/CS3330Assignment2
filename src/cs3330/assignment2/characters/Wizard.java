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
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		double hp = target.getHealth();
		double damage = this.getPower();
		String r = target.getRace();
		
				
		if (r.equals("Human") || r.equals("Wizard")) {
			
			System.out.println(this.getName() + " cast a spell and missed " +  target.getName() + " for 0 damage!");
			
			return false;
		}
		if (r.equals("Dwarf")) {
			
			target.setHealth(hp - (damage*1.5));
			
			System.out.println(this.getName() + "'s attack was super effective! They hit " + target.getName() + " with a fireball for " + damage*1.5 + " damage.");
			
			return true;
		}
		else {
			
			target.setHealth(hp - damage);
			
			System.out.println(this.getName() + "'s attack was effective! They hit " + target.getName() + " with an ice beam for " + damage + " damage.");
			
			return true;
		}
	}

}

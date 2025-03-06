package cs3330.assignment2.council;
import cs3330.assignment2.characters.*;

/**
 * Singleton that returns instance of MiddleEarthCouncil and provides access to class CharacterManager.
 */
public class MiddleEarthCouncil {
	
	private static MiddleEarthCouncil instance;
	
	private MiddleEarthCouncil() {}
	
	/**
	 * 	Returns single instance of MiddleEarthCouncil.
	 */
	public static MiddleEarthCouncil getInstance() {
		if (instance == null) {
			
			instance = new MiddleEarthCouncil();
		}
		
		return instance;
	}
	
	/**
	 * Provides access to CharacterManager class. Returns an object of type CharacterManager.
	 */
		public static CharacterManager getCharacterManager() {
			CharacterManager cm = new CharacterManager();
			return cm;
		}

}

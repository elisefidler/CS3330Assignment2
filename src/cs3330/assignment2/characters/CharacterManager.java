package cs3330.assignment2.characters;

import java.util.Arrays;

import cs3330.project2.characters.MiddleEarthCharacter;

public class CharacterManager {
	
	private MiddleEarthCharacter[] characters;
	private int size = 0;
	
	/**
	 * Adds character to character management system. Dynamically updates size of system by 
	 * doubling array when it is filled. Returns true and updates size if character is successfully
	 * added. Returns false if character is null or cannot be successfully
	 * added.
	 * 
	 * @param c - Character being added to character management system.
	 */
	public boolean addCharacter(MiddleEarthCharacter c) {
		if (c == null) {
			return false;
		}
		
		if (characters == null) {
			characters = new MiddleEarthCharacter[1];
			characters[0] = c;
			size++;
			return true;
		}
		
		 if (size == characters.length) {
			MiddleEarthCharacter[] temp = Arrays.copyOf(characters, size); 
			characters = new MiddleEarthCharacter[size * 2];
			characters = Arrays.copyOf(temp, size * 2);
			characters[size] = c;
			size++;
			return true;
		}
		
		if (size < characters.length) {
			characters[size] = c;
			size++;
			return true;
		}
		
		return false;
	};
	
	/**
	 * Searches for character by name in character management system. Returns character
	 * if it is found. Returns null otherwise.
	 * 
	 * @param name - Name of character being searched for.
	 */
	public MiddleEarthCharacter getCharacter(String name) {
		if (size == 0 || name == null) {
			return null;
		}
		for (int i = 0; i < size; i++) {
			if (characters[i].getName() == name) {
				return characters[i];
			}
		}
		return null;
	};

}

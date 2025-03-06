package cs3330.assignment2.main;

import cs3330.assignment2.characters.*;
import cs3330.assignment2.council.MiddleEarthCouncil;

/**
 * Test class. Tests project by performing CRUD operations on character classes in character manager
 * and testing all possible attack rules.
 */
public class MiddleEarthApp {

	public static void main(String[] args) {
		MiddleEarthCouncil myCouncil = MiddleEarthCouncil.getInstance();
		CharacterManager cm = MiddleEarthCouncil.getCharacterManager();
		
		Dwarf josh = new Dwarf("Josh", 2, 4);
		Elf lala = new Elf("Lala", 4, 6);
		Human stinky = new Human("Stinky", 5, 1);
		Wizard bobo = new Wizard("Bobo", 66, 7);
		Dwarf yumyum =  new Dwarf("YumYum", 5, 67);
		Wizard sauron = new Wizard("Sauron", 15, 16);
		Orc popo = new Orc("Popo", 5, 1);
		
		cm.addCharacter(josh);
		cm.addCharacter(lala);
		cm.addCharacter(stinky);
		cm.addCharacter(bobo);
		cm.addCharacter(yumyum);
		
		
		cm.displayAllCharacters();
		
		cm.deleteCharacter(lala);
		cm.deleteCharacter(lala);
		
		cm.displayAllCharacters();
		
		cm.addCharacter(sauron);
		cm.addCharacter(popo);
		
		cm.displayAllCharacters();
		cm.getCharacter("Bobo").displayInfo(); 
		cm.updateCharacter(yumyum, "YumYum", 1000, 9);
		
		cm.displayAllCharacters();
		
		System.out.println("The battle begins...");

		josh.attack(bobo);
		josh.attack(lala);
		josh.attack(popo);
		
		lala.attack(yumyum);
		lala.attack(popo);
		lala.attack(sauron);
		
		stinky.attack(popo);
		stinky.attack(bobo);
		stinky.attack(josh);
		
		bobo.attack(sauron);
		bobo.attack(yumyum);
		bobo.attack(lala);

		popo.attack(lala);
		popo.attack(stinky);
		popo.attack(josh);
		

		
	}

}

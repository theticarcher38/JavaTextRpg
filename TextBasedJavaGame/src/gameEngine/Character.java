/**
 * @author Hunter Goodman
 * @Date 17-10-2020
 * @version 1.0-ALPHA
 * 
 */
package gameEngine;

import java.util.Scanner;

public class Character {

	public int levelOnePoints = 30;

	String playerName;
	int playerClass;
	int playerHP;
	int playerMP;
	int playerLevel;
	int playerExp;
	int playerStrength;
	int playerDexterity;
	int playerConstitution;
	int playerWisdom;
	int playerIntelligence;
	int playerCharisma;

	@SuppressWarnings("all")
	public Character(String name, int hp, int mp, int level, int exp, int strength, int dexterity, int constitution,
			int wisdom, int intelligence, int charisma, int pClass) {

		playerName = name;
		playerHP = hp;
		playerMP = mp;
		playerLevel = level;
		playerExp = exp;
		playerStrength = strength;
		playerDexterity = dexterity;
		playerConstitution = constitution;
		playerWisdom = wisdom;
		playerIntelligence = intelligence;
		playerCharisma = charisma;
		playerClass = pClass;

	}

	public void pointChecker() {
		if (levelOnePoints <= 0) {
			System.out.println("You do not have enough points to put there");
		} else {

		}
	}

	@SuppressWarnings("all")
	public void createCharacter() {

		String mainPlayerClassText;

		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");

		String mainPlayerName = input.nextLine();

		System.out.println("Your name is: " + mainPlayerName);
		System.out.println("What is your class? ");
		int mainPlayerClass = input.nextInt();

		switch (mainPlayerClass) {

		case 1:
			mainPlayerClassText = "Knight";
			break;
		case 2:
			mainPlayerClassText = "Archer";
			break;

		default:

			while (mainPlayerClass != 1 || mainPlayerClass != 2) {
				System.out.println("Please enter a valid choice");
			}
			break;
		}

		System.out.println("You have " + levelOnePoints + " points to allocate into:");
		System.out.println("Strength");
		System.out.println("Dexterity");
		System.out.println("Constitution");
		System.out.println("Wisdom");
		System.out.println("Intelligence");
		System.out.println("Charisma");

		System.out.println("\nHow many points do you want to put into Strength?");

		int mainPlayerStrength = input.nextInt();
		levelOnePoints = levelOnePoints - mainPlayerStrength;
		pointChecker();
		System.out.println("You have " + levelOnePoints + " points left to spend");

		System.out.println("\nHow many points do you want to put into Dexterity?");

		int mainPlayerDexterity = input.nextInt();
		levelOnePoints = levelOnePoints - mainPlayerDexterity;
		pointChecker();
		System.out.println("You have " + levelOnePoints + " points left to spend");

		System.out.println("\nHow many points do you want to put into Constitution?");

		int mainPlayerConstitution = input.nextInt();
		levelOnePoints = levelOnePoints - mainPlayerConstitution;
		pointChecker();
		System.out.println("You have " + levelOnePoints + " points left to spend");

		System.out.println("\nHow many points do you want to put into Wisdom?");

		int mainPlayerWisdom = input.nextInt();
		levelOnePoints = levelOnePoints - mainPlayerWisdom;
		pointChecker();
		System.out.println("You have " + levelOnePoints + " points left to spend");

		System.out.println("\nHow many points do you want to put into Intelligence?");

		int mainPlayerIntelligence = input.nextInt();
		levelOnePoints = levelOnePoints - mainPlayerIntelligence;
		pointChecker();
		System.out.println("You have " + levelOnePoints + " points left to spend");

		System.out.println("\nHow many points do you want to put into Charisma?");

		int mainPlayerCharisma = input.nextInt();
		levelOnePoints = levelOnePoints - mainPlayerCharisma;
		pointChecker();
		System.out.println("You have " + levelOnePoints + " points left to spend");

		System.out.println("\nYour stats Are:");
		System.out.println("Strength: " + mainPlayerStrength);
		System.out.println("Dexterity: " + mainPlayerDexterity);
		System.out.println("Constitution: " + mainPlayerConstitution);
		System.out.println("Wisdom: " + mainPlayerWisdom);
		System.out.println("Intelligence: " + mainPlayerIntelligence);
		System.out.println("Charisma: " + mainPlayerCharisma);

		input.close();
	}

}

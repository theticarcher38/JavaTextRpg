/**
 * @Author: Hunter Goodman
 * @Date: 17-10-2020
 * @Version: 1.0-ALPHA (Under Development)
 * 
 * Description: A simple text-based role-playing game
 * where I can utilize my the knowledge I have learned
 * while I have been learning Java.
 */
package game;

// Separate Package Imports
import gameEngine.Character;
import gameEngine.Enemy;
import gameEngine.Weapon;
import gameEngine.World;
import gameEngine.WorldObjects;

// Imports the scanner for the user input
import java.util.Scanner;

public class Main {

	private static String mainPlayerName;
	private static int mainPlayerStrength;
	private static int mainPlayerDexterity;
	private static int mainPlayerConstitution;
	private static int mainPlayerWisdom;
	private static int mainPlayerIntelligence;
	private static int mainPlayerCharisma;
	private static int mainPlayerClass;
	static int userMenuChoice;

	static Character player = new Character(mainPlayerName, 30, 40, 1, 0, mainPlayerStrength, mainPlayerDexterity,
			mainPlayerConstitution, mainPlayerWisdom, mainPlayerIntelligence, mainPlayerCharisma, mainPlayerClass);

	public static void menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("============JavaTextRpg============\n");
		System.out.println("=======Please enter a number=======");
		System.out.println("[1] - Character Creation");
		System.out.println("[2] - Exit Program");
		userMenuChoice = input.nextInt();
		switch (userMenuChoice) {
		case 1:

			player.createCharacter();
			WorldObjects.startArea.startArea();
			input.close();
			break;

		case 2:
			System.exit(0);
			break;

		default:
			while (userMenuChoice != 1 || userMenuChoice != 2) {
				System.out.println("Please select a valid option ");
				System.out.println("=======Please enter a number=======");
				System.out.println("[1] - Character Creation");
				System.out.println("[2] - Exit Program");
				userMenuChoice = input.nextInt();
				switch (userMenuChoice) {
				case 1:
					player.createCharacter();
					break;

				case 2:
					System.exit(0);
					break;
				}
				break;
			}
			break;
		}
		input.close();
	}

	public static void main(String[] args) {
		menu();
	}

}

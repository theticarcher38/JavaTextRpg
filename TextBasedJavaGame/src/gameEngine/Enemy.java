/**
 * @author Hunter Goodman
 * @Date 17-10-2020
 * @version 1.0-ALPHA
 * 
 */
package gameEngine;

public class Enemy {

	String enemyName;
	int enemyHP;
	int enemyMP;
	int enemyLevel;

	public Enemy(String eName, int eHp, int eMp, int eLevel) {

		enemyName = eName;
		enemyHP = eHp;
		enemyMP = eMp;
		enemyLevel = eLevel;

	}

	public void createEnemy() {

		System.out.println("\nYou encountered a " + enemyName + "!");
		System.out.println("Level: " + enemyLevel);
		System.out.println("Hit Points: " + enemyHP);
		System.out.println("Mana Points: " + enemyMP);

	}

}
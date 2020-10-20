/**
 * @author Hunter Goodman
 * @Date 17-10-2020
 * @version 1.0-ALPHA
 * 
 */
package gameEngine;

public class Weapon {

	String weaponName;
	int weaponDamage;
	String weaponCategory;
	int weaponWeight;

	public Weapon(String wName, int wDmg, String wCat, int wWeight) {

		weaponName = wName;
		weaponDamage = wDmg;
		weaponCategory = wCat;
		weaponWeight = wWeight;

	}

	public void createWeapon() {

		if (weaponName.startsWith("A") || weaponName.startsWith("E") || weaponName.startsWith("I")
				|| weaponName.startsWith("O") || weaponName.startsWith("U")) {

			System.out.println("\nYou found an " + weaponName);
			System.out.println("Damage: " + weaponDamage);
			System.out.println("Category: " + weaponCategory);
			System.out.println("Weight: " + weaponWeight);

		} else {
			System.out.println("\nYou found a " + weaponName);
			System.out.println("Damage: " + weaponDamage);
			System.out.println("Category: " + weaponCategory);
			System.out.println("Weight: " + weaponWeight);
		}

	}

}

package gameEngine;

public class World {

	String areaDescription;
	int areaID;

	public World(String description, int ID) {
		areaDescription = description;
		areaID = ID;
	}

	public void startArea() {
		System.out.println("This is some text");
	}

}

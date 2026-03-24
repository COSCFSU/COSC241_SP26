package edu.frostburg.cosc241.Mar5;

public class Squirtle extends WaterPokemon {

	public Squirtle(String name) {
//		super();
//		this.name = name;
//		this.sound = "SQUIRTLE!";
		super(name, "SQUIRTLE!");  // new way
	}
	
	public void watergunAttack() {
		System.out.println("squirtle attack!");
		// note that this is a different method than the one WaterPokemon has
	}
	
}

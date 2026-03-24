package edu.frostburg.cosc241.Mar5;

public class WaterPokemon extends Pokemon implements Movable {

	public WaterPokemon(String name, String sound) {
		this.name = name;
		this.sound = sound;
	} // inherit from Pokemon class

	public void watergunAttack() {
		System.out.println("watery gun?");
	}

	@Override
	public void move() {
		System.out.printf("%s moves!%n", name);
	}

	@Override
	public void example2() {
		System.out.println("stuff");
	}
}

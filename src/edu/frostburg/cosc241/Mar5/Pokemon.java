package edu.frostburg.cosc241.Mar5;

/**
 * A class representing Pokemon.  It has some poke-stats.  It should
 * 	be subclassed into real Pokemon.
 */
public abstract class Pokemon {
	protected String name;
	protected String sound;
	
	public Pokemon() {
		System.out.println("This is the default constructor");
		name = "no name";
		sound = "silence";
	}
	
	public Pokemon(String name, String sound) {
		super();
		this.name = name;
		this.sound = sound;
	}
	
	
	public void speak() {
		System.out.printf("%s says: %s!!%n", name, sound);
	}
	
	public void example() {
		System.out.println("This is from the Pokemon class");
	}
	
	public abstract void example2();

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", sound=" + sound + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
}

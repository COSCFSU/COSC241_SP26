package edu.frostburg.cosc241.Mar5;

public class Driver {

	public static void main(String[] args) {
//		example1();
		example2();
	}

	private static void example2() {
		WaterPokemon[] pokes = new WaterPokemon[3];
		
		pokes[0] = new WaterPokemon("Vaporeo", "Vape!");
		pokes[1] = new Squirtle("Squee");
		pokes[2] = new WaterPokemon("Starrrrrio", "Starry");
		
		for(int i=0; i<pokes.length; i+=1) {
			System.out.println(pokes[i]);
			pokes[i].speak();
			pokes[i].watergunAttack();
			pokes[i].move();
		}
	}

	private static void example1() {
//		Pokemon p = new Pokemon("a", "b");
//		Pokemon p1 = new Pokemon();
		
		Squirtle sq = new Squirtle("Squirbob Squirpants");
		Squirtle sq1 = new Squirtle("Squirdward");
		Pokemon psq = new Squirtle("Squirthree");
//		Squirtle sqx = new Pokemon("squirtle", "squirtle"); // <- No!
		
//		System.out.println(p);
//		System.out.println(p1);
//		
//		p1.speak();
		sq.speak();
		
		
		sq1.speak();
		psq.speak();
		
		sq1.watergunAttack();
//		psq.watergunAttack();  // <- does not work like this.. even with polymorphism
		Squirtle tempSq = (Squirtle)psq;
		tempSq.watergunAttack();
	}

}

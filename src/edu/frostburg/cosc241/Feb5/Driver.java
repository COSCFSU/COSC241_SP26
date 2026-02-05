package edu.frostburg.cosc241.Feb5;

public class Driver {

	public static void main(String[] args) {
		
		// A lantern
		Example lantern = new Example();
		lantern.name = "Bob";
		String top = lantern.getTop();
		String mid = lantern.getMiddle();
		String bot = lantern.getBottom();
		
		
		System.out.println(top);
		System.out.println(mid);
		System.out.println(bot);
//		System.out.println(lantern.name);
		
		// Another lantern
		Example lanternA = new Example();
		top = lanternA.getTop();
		mid = lanternA.getMiddle();
		bot = lanternA.getBottom();
		
		System.out.println(top);
		System.out.println(mid);
		System.out.println(bot);
//		System.out.println(lanternA.name);

		
		
		
		// more examples
		lantern.runLoopExample(10);
		lanternA.runLoopExample(4);
		
		lantern.makeMultiplicationTable(3);
		lanternA.makeMultiplicationTable(9);
		
		System.out.println(lantern.showConditionalExample(74.9f));
		
//		for (int i = 0; i<100; i++) {
//			System.out.println("say theGrade GETS C");
//		}
	}

}

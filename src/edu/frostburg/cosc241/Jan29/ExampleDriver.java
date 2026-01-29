package edu.frostburg.cosc241.Jan29;

public class ExampleDriver {

	public static void main(String[] args) {
		
		Examples myExample = new Examples();		
		
		// numbers
		int result = myExample.add(5,5);
		System.out.println(result);
		result = myExample.add(7, -1);
		System.out.println(result);
		
		// strings
		myExample.print("Some text");
		myExample.showStringExamples("first", "second");
	}

}

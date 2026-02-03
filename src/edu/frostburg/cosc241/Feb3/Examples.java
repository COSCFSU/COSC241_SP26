package edu.frostburg.cosc241.Feb3;

/**
 * Java code for practice.
 */
public class Examples {

	public void showTypes() {
		long l = 99999999;
		int i = 9999999;
		short sh = 9999;
		byte b = 99;
		
		boolean bool = false;
		char ch = 'x';
//		char ch2 = "x";
		String s = "hello";
//		String s2 = 'hello';
		double d = 99.9;
		float f = 99.9f;
	}
	
	public void doStringStuff(String s1, String s2) {
		System.out.println(s1);
		
		String myStr = s1 + s2;
		
		System.out.println(myStr);
		
		// for (init; condition; update)
		// generic loop, prints i a bunch of times
		for(int i=0;i < myStr.length();i+=1) {
			System.out.println(i);
		}
		
		// print out every other letter
		for(int i=0;i < myStr.length();i+=2) {
			System.out.print(myStr.charAt(i));
		}
		System.out.println();
		
		// print the word backwards
		for(int i=myStr.length()-1; i >= 0; i-=1) {
			System.out.print(myStr.charAt(i));
		}
		System.out.println();
		
		if(myStr.charAt(0) == 'X') {
			System.out.println("The first letter is X!");
		} else if(myStr.charAt(0) == 'H') {
			System.out.println("It's H!");
		} else {
			System.out.println("It isn't X or H");
		}
	}
}

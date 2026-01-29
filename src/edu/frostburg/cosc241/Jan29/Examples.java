package edu.frostburg.cosc241.Jan29;

public class Examples {

	public void print(String word) {
		System.out.println(word);		
	}
	
	public void showStringExamples(String word1, String word2) {
		String concatenatedString = word1 + word2;
		System.out.println(concatenatedString);
		
		System.out.println(word1.charAt(0));
		System.out.println(word1.charAt(1));
		System.out.println(word1.indexOf("s"));
		
		// for (init; continuation condition;update)
		
		for (int i = 0; i < word1.length(); i += 1) {
			// body
			System.out.println(i);
			System.out.println(word1.charAt(i));
		} // end of for loop
		
//		// conditional
//		if (condition) {
//			// true stuff
//		} else {
//			// false stuff
//		}
	}
	
	public int add(int a, int b) {
		int result = a + b;
//		System.out.println(result);
		
		// other math things for example
		
		// x = (a+b) - (c+d) * 3
		
		return result;
	}
	
	/**
	 * This is just space used for notes
	 */
	
	/*
	 * 
	 *  Super important stuff to memorize:
	 
	 	long l; 	// 64 bits
		int i; 		// 32 bits
		short sh; 	// 16 bits
		byte bt; 	// 8 bits
		
		boolean bool; // 1 bit (secretly uses 32 on the stack anyway)
		char ch;	// 16 bits, character in UNICODE
		double d;	// 64 bit floating point
		float f;	// 32 bit floating point
	 *	
	 */
}

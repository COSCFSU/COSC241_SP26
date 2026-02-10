package edu.frostburg.cosc241.Feb10;

/**
 * Examples for Feb 10 class...
 * 
 * @author sdkennedy
 */
public class Example {
	public String myName = "Steve";
	
	public void runCastExamples() {
		int number = 42;
		long lnum = number; // okay for smaller -> bigger container
//		short shnum = number; // not okay for bigger -> smaller... maybe
		short shnum2 = (short)number;  // type cast!
		byte bnum = (byte)number; // another cast
		System.out.printf("%d: %d, %d, %d %n", number, lnum, shnum2, bnum);	
		
		int bigNumber = 999;
		byte bnum2 = (byte)bigNumber;  // overflows, becomes junk
		System.out.printf("%d: %d%n", bigNumber, bnum2);
	}
	
	/*
	 * This is an example.
	 */
	public void runCastExamples2() {
		char favChar = 'K';
		short myChar = (short)favChar;
		
		short ascii = 65;
		char myChar2 = (char)ascii;
		
//		favChar += 1;
//		System.out.print(favChar);
//		System.out.println(myChar);
	}
	
	/**
	 * Show how to print alphabet in a for loop
	 */
	public void runExamples3() {
//		char first = 'A';
		
		for (char i='A'; i <= 'Z'; i+=1) {
			short ascii = (short)i;
			System.out.printf("%c:%d%n", i, ascii);
		}
	}
	
	/**
	 * Encode or decode a String using a Caesar cipher.
	 * @param word the word to encode/decode
	 * @param key the Caesar key
	 * @return the translated word
	 */
	public String doCaesar(String word, int key) {
		String translated = "";
		// go through the word, char by char
		for (int i=0; i<word.length(); i+=1) { // (init; condition; update)
			// add key to the char and put it back together
			translated += (char)(word.charAt(i) + key);
		}
		return translated;
	}
	
	/**
	 * Some stuff about conditional logic
	 */
	public void showConditionalExamples() {
		boolean a = true;
		boolean b = false;
		
		if (a && b) {
			System.out.println("something");
		}
	}
}

package edu.frostburg.cosc241.Feb3;

public class Lab_JavaExamples {
/*
	2)	starPad(word, padding)
	a)	This method pads makes sure a string is at least length padding.  
		If it is greater or equal to that length, then do nothing and return the original 
		string.  If it is less than the padding, then add ‘*’ characters until it is that 
		length and return the new string.
*/
	
	public String starPad(String word, int padding) {
		if (word.length() >= padding) {
			return word;
		}
		
		// if word length is less than padding, repeat:
		//	put a star at the end		
		
		System.out.println(padding - word.length());
		int len = padding - word.length(); // length changes on every iteration, so 
											// we have to do this outside of the loop
		for(int i = 0; i < len; i+=1) {
			word = word + '*';
			System.out.println(word);
		}
		
		return word;
	}
	
	
	
	
	
	
	/*
	 * DoMath(x, y, z)
	a. Return the value of this expression: x / y * z2 + 1 + 2 / x + 3 + 4 / y. 
		Be sure to use floating point numbers. Use parentheses to make the expression more 
		clear.
	b. Print that result in the driver class.
	 */
	
	public float doMath(float x, float y, float z) {
		return (x / y * (z * z) + 1 + 2 / x + 3 + 4 / y);
	}
}

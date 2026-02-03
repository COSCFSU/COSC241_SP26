package edu.frostburg.cosc241.Feb3;

public class Lab0000_Examples {
	
	public boolean isPrime(long p) {
		if (p <= 1) { // defensive programming!
			return false;
		}
		
		/*
		 * make a loop,
		 */
		
//		for (long i=2; i*i<=p; i+=1) {
//			if (p%i==0) {
//				return false;
//			}
//		}
		
		for (int i=2; i < p; i+=1) {
			if (p%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	/*
	 * RemoveVowels(String s)
	a. Returns a new String that contains none of the vowels from s. For example, if s was
	“Hello World!”, the method would return “Hll Wrld!”. Note that there is no automatic
	way to do this. You’ll have to figure out a way to do this. Conditionals and loops in Java
	are very similar to Python, but with a new syntax.
	 */
	
	public String removeVowels(String s) {
		// change s to lower case
		s = s.toLowerCase();
		// get a list of vowels
		String vowels = "aeiou";
		// make a new empty temp string
		String noVowelString = "";
		// loop:
		//	if theres a vowel, ?remove it?
		// 	store the new non-vowel consonants into the temp string
		for(int i=0; i < s.length() ; i+=1) {
//			System.out.println(i + ":" + s.charAt(i));
			if (vowels.indexOf(s.charAt(i)) == -1) { // is this character a vowel?
				noVowelString = noVowelString + s.charAt(i);
			}
		}
		// return temp string
		return noVowelString;
	}
}

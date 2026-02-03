package edu.frostburg.cosc241.Feb3;

/**
 * Run the example code for Feb 3.  Commented out some lines so it is cleaner output
 * 		during class, but feel free to uncomment.
 */
public class Driver {

	public static void main(String[] args) {
//		Lab0000_Examples lab = new Lab0000_Examples();
		
//		long p = 1980;
//		System.out.println(lab.isPrime(p));
//		
//		System.out.println(lab.removeVowels("Hello World"));
		
		
		Examples ex = new Examples();
		// String examples
		ex.doStringStuff("hello", "rob wave");
		
		// Type identifier = value
		// Type identifier = new Type()  // instantiation
		// the lab stuff
		Lab_JavaExamples lJava = new Lab_JavaExamples();
		String s = lJava.starPad("hello", 10);
		System.out.println(s);
		
		float first = lJava.doMath(5, 6, 7);
		float second = lJava.doMath(99.5f, 10.5f, 1.9f);
		System.out.println(first);
	}

}

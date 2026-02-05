package edu.frostburg.cosc241.Feb5;

/*
 * multi line comment
 * 
 * la lala
 * 
 * df
 * sedf
 */

/**
 * An example for Java methods and misc.
 */
public class Example {

	// field members (aka "fields)
	public String name = "None";

	/**
	 * Top of a lantern.
	 * 
	 * @return a string of the lantern top
	 */
	public String getTop() {
		String line1 = " =====";
		String line2 = " |   |";

		return line1 + '\n' + line2;
	}

	/**
	 * Middle of lantern.
	 * 
	 * @return
	 */
	public String getMiddle() {
		String line1 = " ----- ";
		String line2 = "|     |";

		return line1 + '\n' + line2 + '\n' + name + '\n' + line2 + '\n' + line1;
	}

	public String getBottom() {
		String line1 = " |===|";
		String line2 = " =---=";

		return line1 + '\n' + line2;
	}

	// ---------- More examples -------------

	/**
	 * Print name a few times
	 * 
	 * @param n this many times
	 */
	public void runLoopExample(int n) {
		int i = 0;
		while (i < n) {
			System.out.print(name + " ");

//			i = i + 1;
			i += 1;
//			i++;
//			++i;
		}
		System.out.println();
	}

	/**
	 * Prints a multiplication table of nxn
	 * 
	 * @param n the size
	 */
	public void makeMultiplicationTable(int n) {
		// for(init; condition; update)
		
		// columns
		for (int i = 1; i <= n; i += 1) {
			// row
			for (int j = 1; j <= n; j += 1) {
				long result = i * j;
//				System.out.print(result + " ");
				System.out.printf("%3d ", result);
			} // end of row loop
			System.out.println();
			
		} // end of column loop
	}
	
	/**
	 * Conditional example
	 */
	public char showConditionalExample(float grade) {
		char theGrade = 'F';
		if (grade >= 90) {
			theGrade = 'A';
		} else if (grade >= 80) {
			theGrade = 'B';
		} else if (grade >= 70) {
			theGrade = 'C'; // say "theGrade GETS C"
		} else if (grade >= 60) {
			theGrade = 'D';
		}
		return theGrade;
	}
}

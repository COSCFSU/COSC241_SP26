package edu.frostburg.cosc241.Mar24;

public class Tester {

	public static void main(String[] args) {
		RecursionExamples ex = new RecursionExamples();

//		runTuesdayExamples(ex);
		runThursdayEamples(ex);
	}
	
	public static void runThursdayEamples(RecursionExamples ex) {
//		int[] a = new int[]{2, 2, 2, 2};
//		
//		long result = ex.sum(a);
//		System.out.printf("The array sum is %d%n", result);
//		
//		ex.printWeird("HELLO");
//		System.out.println();
		
		// Infix express
		String exp;
//		exp = "+ 2 5";
//		exp = "* + 3 4 2";
//		exp = "+ + 2 5 + 1 5";
		exp = "* + + 2.5 1.5 1 + 1 1";
		double res = ex.evaluate(exp);
		System.out.printf("%s = %f%n", exp, res);
	}
	
	public static void runTuesdayExamples(RecursionExamples ex) {
//		ex.a(5);
		
//		int i = ex.add(5);
//		System.out.println(i);
		
//		int a = 2;
//		int b = 4;
//		long p = ex.pow(a, b);
//		System.out.printf("%d^%d=%d%n", a, b, p);
		
		String one = "abcd";
//		String one = "HelloIzzyHowAreYou?";
		String two = ex.reverse(one);
		System.out.printf("%s -reverse-> %s%n", one, two);
	}

}

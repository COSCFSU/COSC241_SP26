package edu.frostburg.cosc241.Mar24;

public class Tester {

	public static void main(String[] args) {
		RecursionExamples ex = new RecursionExamples();
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

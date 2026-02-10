package edu.frostburg.cosc241.Feb10;

public class Driver {

	public static void main(String[] args) {
		Example feb10ex = new Example();
		
//		feb10ex.runCastExamples();
//		feb10ex.runCastExamples2();
//		feb10ex.runExamples3();
		showCaesarExamples(feb10ex);
	}
	
	public static void showCaesarExamples(Example ex) {
		String word1 = "hello";
		String word2 = "ifmmp";
		String word3 = "";
		
		int k1 = 1;
		int k2 = -1;
		
		String s1 = ex.doCaesar(word1, k1);
		String s2 = ex.doCaesar(word2, k2);
//		String s3 = ex.doCaesar(null, 0);
		
		System.out.printf("%s(%d): %s%n", word1, k1, s1);
		System.out.printf("%s(%d): %s%n", word2, k2, s2);

	}

}

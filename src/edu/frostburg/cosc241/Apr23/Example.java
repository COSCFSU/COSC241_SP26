package edu.frostburg.cosc241.Apr23;

public class Example {

	public static void main(String[] args) {
//		example1();
//		example2();
		
		sortTest1();
	}

	private static void sortTest1() {
//		String[] strings = new String[] {"5", "4", "3", "2", "1"};
//		String[] strings = new String[] {"1", "2", "3", "4", "5"};
		String[] strings = new String[] {"Bob", "Alice", "Dog", "Cat", "Earl"};
		
		Vector2<String> v = new Vector2<String>(strings, 5);
		v.insertionSort();
		System.out.println();
	}

	private static void example2() {
		String[] s1 = new String[] {"a", "b", "c", "d", "e"};
		String[] s2 = new String[] {"a", "b", "cat", "d", "e"};
		
		Vector2<String> v2a = new Vector2<String>(s1, 5);
		Vector2<String> v2b = new Vector2<String>(s2, 5);
		
		if (v2a.equals(v2b)) {
			System.out.println("They are the same!");
		} else {
			System.out.println("They are not the same :(");
		}
	}

	private static void example1() {
		String a = "a";
		String b = "b";
		String c = "c";
		
		
		if (a.compareTo(b) > 0) {
			System.out.println(a + " wins!");
		} else {
			System.out.println(b + " wins...");
		}
		
		
	}

}

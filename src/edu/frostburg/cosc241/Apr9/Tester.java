package edu.frostburg.cosc241.Apr9;

public class Tester {

	public static void main(String[] args) {
//		runStackTest1(10);
//		runLLTest1();
//		runLLTest2();
//		runLLTest3();
		runLLTest4();
	}

	// test insert
	private static void runLLTest4() {
		ExampleLinkedList ll = new ExampleLinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		
		ll.insert(4, 999);
		
		ll.printQueue();
	}

	private static void runLLTest3() {
		ExampleLinkedList ll = new ExampleLinkedList();

		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		
		int size = ll.getCount();
		for (int i=0; i<size; i+=1) {
			int n = ll.remLast();
			System.out.println(n);
		}
	}

	private static void runLLTest2() {
		ExampleLinkedList ll = new ExampleLinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		
		int size = ll.getCount();
		for (int i=0; i<size; i+=1) {
			int n = ll.remFirst();
			System.out.println(n);
		}
	}

	private static void runLLTest1() {
		ExampleLinkedList ll = new ExampleLinkedList();
		
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		
		for (int i=0; i<ll.getCount(); i+=1) {
			int n = ll.remFirst();
			System.out.println(n);
		}
	}

	private static void runStackTest1(int n) {
		ExampleStack stack = new ExampleStack(n);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		int i = stack.pop();
		System.out.printf("Popped %d%n", i);
		i = stack.pop();
		System.out.printf("Popped %d%n", i);
		i = stack.pop();
		System.out.printf("Popped %d%n", i);
		i = stack.pop();
		System.out.printf("Popped %d%n", i);
	}

}

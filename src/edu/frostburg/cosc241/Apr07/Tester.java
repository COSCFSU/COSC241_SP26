package edu.frostburg.cosc241.Apr07;

public class Tester {

	public static void main(String[] args) {
//		runStackTest1(10);
		runLLTest1();
	}

	private static void runLLTest1() {
		ExampleLinkedList ll = new ExampleLinkedList();
		
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
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

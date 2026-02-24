package edu.frostburg.cosc241.Feb24;

public class Driver {

	public static void main(String[] args) {
		Student s1 = new Student("Bob", "123", 1.2f, 14);
		
		
		Classroom classroom = new Classroom("CCIT270", true, null);
		Classroom classroom2 = new Classroom("CCIT271", false, null);
		
		System.out.println(classroom);
		System.out.println(classroom.getRoomNum());
		System.out.println(classroom2.getRoomNum());
		
		System.out.println(s1);
	}

}

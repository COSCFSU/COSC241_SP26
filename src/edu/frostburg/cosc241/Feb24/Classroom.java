package edu.frostburg.cosc241.Feb24;

/**
 * A proper OOP style class for a Classroom.
 */
public class Classroom {

	private String roomNum;
	private boolean isLit;
	private Student[] students;
	
	/* Constructor */
	public Classroom(String roomNum, boolean isLit, Student[] students) {
		/* "this" refers to the object that is being constructed 
		 * 	in this constructor method 
		 */
		this.roomNum = roomNum;
		this.isLit = isLit;
		this.students = students;
		
		/* can't see it, but the object itself is returned... */
	}
	
	
	/* Utility methods */
	
	@Override
	public String toString() {
		return roomNum + ":" + isLit;	
	}
	
	
	/* ----- Accessors / Mutators ------ */
	
	public String getRoomNum() {
		return roomNum;
	}
	
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	
	public boolean isLit() {
		return isLit;
	}
	
	public void isLit(boolean isLit) {
		this.isLit = isLit;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	/* No mutator for students yet... */
	
}

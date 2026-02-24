package edu.frostburg.cosc241.Feb24;

/**
 * This is our example student class.  It represents an FSU student.
 * 
 * This example is incomplete but enough to show the concepts of OOP.
 */
public class Student {
	public String name;
	private String studentID; 
	protected float gpa;
	/* default */ int totalCredits;
	
	public Student(String name, String studentID, float gpa, int totalCredits) {
//		super();
		this.name = name;
		this.studentID = studentID;
		this.gpa = gpa;
		this.totalCredits = totalCredits;
	}
	
	
	
	/* Accessors and Mutators
	 *  aka "Getters" and "Setters"
	 *  
	 *  
	 *  Generally speaking, you should have getters and setters for all
	 *  	relevant field members.
	 */
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentID=" + studentID + ", gpa=" + gpa + ", totalCredits=" + totalCredits
				+ "]";
	}



	/**
	 * Accessor for name
	 * @return name field
	 */
	public String getName() {
		return name;
	}
	
	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String id) {
		studentID = id;
	}
}

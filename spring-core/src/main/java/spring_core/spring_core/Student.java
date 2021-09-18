package spring_core.spring_core;

public class Student {
	private int studentID;
	private String studentAddresses;
	private String studentPhones;
	
		
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		System.out.println("Seeting student ID");
		this.studentID = studentID;
	}

	public String getStudentAddresses() {
		return studentAddresses;
	}

	public void setStudentAddresses(String studentAddresses) {
		System.out.println("Seeting student Address");
		this.studentAddresses = studentAddresses;
	}

	public String getStudentPhones() {
		return studentPhones;
	}

	public void setStudentPhones(String studentPhones) {
		System.out.println("Seeting student Phones");
		this.studentPhones = studentPhones;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentAddresses=" + studentAddresses + ", studentPhones="
				+ studentPhones + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentID, String studentAddresses, String studentPhones) {
		super();
		this.studentID = studentID;
		this.studentAddresses = studentAddresses;
		this.studentPhones = studentPhones;
	}
	

}

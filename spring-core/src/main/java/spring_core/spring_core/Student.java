package spring_core.spring_core;

public class Student {
	private int studentID;
	private String studentAddresses;
	private String studentPhones;
	
		
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentAddresses() {
		return studentAddresses;
	}

	public void setStudentAddresses(String studentAddresses) {
		this.studentAddresses = studentAddresses;
	}

	public String getStudentPhones() {
		return studentPhones;
	}

	public void setStudentPhones(String studentPhones) {
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

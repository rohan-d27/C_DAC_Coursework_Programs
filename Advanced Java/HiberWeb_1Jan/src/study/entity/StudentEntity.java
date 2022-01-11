package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "iet_student")
public class StudentEntity {
	
	@Id
	@Column(name = "roll_number")
	private int rollNumber;
	
	@Column(name="student_name")
	private String studentName;

	public int getRollNumber() {
		System.out.println("get roll number");
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		System.out.println("set roll number");
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		System.out.println("get stud name");
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("set stud name");
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "StudentEntity [rollNumber=" + rollNumber + ", studentName=" + studentName + "]";
	}

	public StudentEntity(int rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	
	public StudentEntity() {
		System.out.println("stud entity construcor");
	}
	
}

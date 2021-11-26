package practice_program_project_25nov;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
	private String name;
	private int age;
	private int[] marks;

	public Student(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, int[] marks) {

		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student Name=" + name + ", Age=" + age + ", Marks=" + Arrays.toString(marks) + "\n";
	}


}

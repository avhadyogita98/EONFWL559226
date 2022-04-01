package com.Spring_6772;

public class Student
{
	private int student;
	private String studentName;
	private int age;
	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int student, String studentName, int age) {
		super();
		this.student = student;
		this.studentName = studentName;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [student=" + student + ", studentName=" + studentName + ", age=" + age + "]";
	}
	
	
	
	}
	
	


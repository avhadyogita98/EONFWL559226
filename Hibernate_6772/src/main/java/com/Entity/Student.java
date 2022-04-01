package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	int roll;
	
	@Column
	String name;
	
	@Column
	String email;
	public int getRoll()
	{
		return roll;
	}
	public void setRoll(int roll) 
	{
		this.roll = roll;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public Student(int roll, String name, String email)
	{
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + "]";
	}
	
	
}

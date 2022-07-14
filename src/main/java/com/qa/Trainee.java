package com.qa;

public class Trainee {
	
	String name;
	int age;
	String course;
	
	public Trainee(String name, int age, String course) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
	
}

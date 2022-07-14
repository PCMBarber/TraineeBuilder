package com.qa;

public class TraineeBuilder {
	
	String name;
	int age = 0;
	String course = "Unassigned";
	
	public Trainee buildTrainee() {
		return new Trainee(name, age, course);
	}
	
	public TraineeBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public TraineeBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public TraineeBuilder course(String course) {
		this.course = course;
		return this;
	}
}

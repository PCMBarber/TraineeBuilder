package com.qa;

public class TraineeYear2 extends Trainee {
	
	String courseYear2;

	public TraineeYear2(String name, int age, String course, String courseYear2) {
		super(name, age, course);
		this.courseYear2 = courseYear2;
	}

	public String getCourseYear2() {
		return courseYear2;
	}

	public void setCourseYear2(String courseYear2) {
		this.courseYear2 = courseYear2;
	}

	@Override
	public String toString() {
		return "TraineeYear2 [courseYear2=" + courseYear2 + "]";
	}
	
	

}

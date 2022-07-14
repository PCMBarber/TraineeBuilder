package com.qa;

public class TraineeYear2Builder extends TraineeBuilder {
	
	String courseYear2 = "Unassigned";
	
	@Override
	public TraineeYear2 buildTrainee() {
		return new TraineeYear2(name, age, course, courseYear2);
	}
	
	public TraineeYear2Builder courseYear2(String courseYear2) {
		this.courseYear2 = courseYear2;
		return this;
	}
}

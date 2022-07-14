package com.qa;

public class Runner {

	public static void main(String[] args) {
		
		Trainee trainee1 = new Trainee("Alex", 24, "QA Enable");
		
		Trainee trainee2 = new TraineeBuilder().name("Alex").age(24).course("QA Enable").buildTrainee();
		
		Trainee trainee3 = new TraineeBuilder().name("Alex").buildTrainee();
		
		System.out.println(trainee2);
		
		System.out.println(trainee3);
	}

}

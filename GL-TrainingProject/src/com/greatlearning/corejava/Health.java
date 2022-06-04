package com.greatlearning.corejava;
// Algorithm
// step 1 Create package in the name of com.greatlearning.corejava
// step 2 inside package create separate class Health and HealthDriver
// step 3 Inside Health class declare variables -- age of type int, weight of type float,bmi of type float
// step 4 Declare main method inside HealthDriver class 
// step 5 Create object of Health class inside HealthDriver
// step 6 Create method with void type with printing age,weight,bmi variables.
// step 7 call method inside Health class to show output to user.
// step 8 stop.


public class Health {
protected int age = 30;
protected float weight = 75.5f ;
protected float bmi =185.1f ;

public void PrintVaribles() {
	System.out.println(age);
	System.out.println(weight);
	System.out.println(bmi);
}
}


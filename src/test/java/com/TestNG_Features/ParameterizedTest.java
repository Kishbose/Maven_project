package com.TestNG_Features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Test
	@Parameters({"Name","Age","Degree"})
	public void name(@Optional("cut")String Name,int Age,String Degree) {
		System.out.println("Enter a Name : "+Name);
		System.out.println("Enter a Age : "+Age);
		System.out.println("Enter a Degree : "+Degree);
	
	}
	
	@Test
	@Parameters({"Day1","Day2","Day3"})
	public void Details(@Optional("Topic")String Day1,String Day2,String Day3) {
		System.out.println("First Day Topic : "+Day1);
		System.out.println("Second Day Topic  : "+Day2);
		System.out.println("Third Day Topic  : "+Day3);
	}
	

}

package com.TestNG_Features;



import org.testng.annotations.Test;


public class Timeout_Test {

	@Test(timeOut = 6000)
	public void Projects() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("Data");

		Thread.sleep(2000);
		System.out.println("TestNG");

		Thread.sleep(1000);
		System.out.println("Cucumber");

	}
}
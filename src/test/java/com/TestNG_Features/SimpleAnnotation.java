package com.TestNG_Features;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SimpleAnnotation {
	@Test
	public void Test() {
		System.out.println("USERNAME : ka*****h");
	}

	@Test
	public void Test2() {
		System.out.println("PASSWORD : ******");
	}

	@Test
	public void Test3() {
		System.out.println("Submit");
	}
@Test
	public void Test4() {
		System.out.println("Purchase product");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Logged Successfully");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Order Verified");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Login");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Verified Payment");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("URL Launch");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Payment Done");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Browser Launch");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Logout");
	}

}

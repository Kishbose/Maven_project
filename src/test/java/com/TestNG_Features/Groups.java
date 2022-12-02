package com.TestNG_Features;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups ="Selenium" )
	public void WebDriver() {
		System.out.println("WebDriver");
	}

	@Test(groups ="Selenium" )
	public void WebElement() {
		System.out.println("WebElement");
	}

	@Test(groups ="Selenium" )
	public void WebTable() {
		System.out.println("WebTable");
	}

	@Test(groups = "Maven")
	public void Ignore() {
		System.out.println("Ignore");
	}
	
	@Test(groups = "Java")
	public void Timeout() {
		System.out.println("String");
	}
}

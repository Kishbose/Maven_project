package com.TestNG_Features;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedException {

	@Test(expectedExceptions = WebDriverException.class)
	public void expected() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\kishv\\\\eclipse-workspace\\\\Selenium_Testing\\\\Driver\\\\chromedriver.exe ");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://profile.w3schls.com/");

	}
}
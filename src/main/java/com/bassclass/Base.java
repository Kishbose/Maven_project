package com.bassclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static WebDriver BrowserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void urlLauch(String url) {
		driver.get(url);

	}

	public static void close() {
		driver.close();
	}

	public static void Quit() {
		driver.quit();

	}

	public static void navigate(String url) {
		driver.navigate().to(url);
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

	}

	public static void title(String url) {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

	// Alert

	public static void alert() {
	   
		driver.switchTo().alert();
	}
		
		public static void click( WebElement element) {
			element.click();
			
		}
		
	public static void accept() {
		driver.switchTo().alert().accept();
	}

	public static void dismiss() {
		driver.switchTo().alert().dismiss();
	}
//
//	public static void sendkeys(WebElement element ,String input) {
//		Alert alert = driver.switchTo().alert();
//		element.sendKeys(input);
//		
//		
//	}

	public static void sendkeys(WebElement element ,String input) {
		element.sendKeys(input);
}

	public static void clear( WebElement element) {
		element.clear();
}	
   
	public static void selectByVisibleText (WebElement element ,String input) {
		element.sendKeys(input);
	}
	
    public static void selectByIndex(WebElement element,int i) {
	Select s = new Select(element);
	s.selectByIndex(i);
	
}



























	}

	

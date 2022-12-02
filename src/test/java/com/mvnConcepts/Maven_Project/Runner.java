package com.mvnConcepts.Maven_Project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.bassclass.Base;

public class Runner extends Base {
	public static void main(String[] args) throws InterruptedException {
		BrowserLaunch();
     
	urlLauch("https://demo.automationtesting.in/Alerts.html");
//    navigate("https://www.instagram.com/");
//	   title("https://www.youtube.com/");
//	  	 
//	 WebElement find = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//	 click(find);
//	 accept();
//
//	 WebElement findElement = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
//		findElement.click();
//	 
//	 WebElement dis = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
//    click(dis);
//	dismiss();
	
	WebElement input = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	input.click();
	
	WebElement keys = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	click(keys);
	Thread.sleep(3000);
    sendkeys(keys, "Bose");
 //accept();
//	
//	WebElement findElement = driver.findElement(By.name("q"));
//	sendkeys(findElement,"sdasdajd");
//	
	

	
	
	
	
	
	
	
	
	
	
	
	}
		}


 
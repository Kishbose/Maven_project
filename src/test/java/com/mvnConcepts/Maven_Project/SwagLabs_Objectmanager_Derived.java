package com.mvnConcepts.Maven_Project;

import org.openqa.selenium.WebElement;
import com.bassclass.Base;
import Booking_Task.SwagLabs_Objectmanager_Bass;

public class SwagLabs_Objectmanager_Derived extends Base {
	
	public static void main(String[] args) throws Exception {
		
	BrowserLaunch();
	urlLauch("https://www.saucedemo.com/");
	
	SwagLabs_Objectmanager_Bass swag = new SwagLabs_Objectmanager_Bass(driver);
	
	WebElement User = swag.getBook_Login().getUsername();
	sendkeys(User, "performance_glitch_user");
	
	WebElement pass = swag.getBook_Login().getPassword();
	sendkeys(pass,"secret_sauce");

	WebElement login = swag.getBook_Login().getLogin();
	click(login);
	Thread.sleep(2000);
	
	//dress
	WebElement dress = swag.getBook_check().getJacket();
	click(dress);

	WebElement add = swag.getBook_check().getAddcart();
	click(add);

    WebElement cart = swag.getBook_check().getCartlink();
	click(cart);
	
	WebElement check = swag.getBook_check().getCheckout();
	click(check);
    Thread.sleep(2000);
   
    //Checkout   
	WebElement name = swag.getBook_Search().getName();
	sendkeys(name,"Bose");

	WebElement lastname = swag.getBook_Search().getLastname();
	sendkeys(lastname,"H");
	
	WebElement code = swag.getBook_Search().getCode();
	sendkeys(code,"603406");

	WebElement continue1 = swag.getBook_Search().getContinue1();
	click(continue1);
	Thread.sleep(2000);

	WebElement finish = swag.getBook_Search().getFinish();
	click(finish);
	}	
}

package com.mvnConcepts.Maven_Project;

import org.openqa.selenium.WebElement;

import com.bassclass.Base;

import Adactin.Adactin_Objectmanager_Base;

public class Adactin_Objectmanager_Derived extends Base {

	public static void main(String[] args) {

		BrowserLaunch();
		urlLauch("https://adactinhotelapp.com/");

		Adactin_Objectmanager_Base  ab = new Adactin_Objectmanager_Base (driver);

		WebElement username = ab.getAdatin_Method().getUsername();
		sendkeys(username, "kishbose");

		WebElement password = ab.getAdatin_Method().getPassword();
		sendkeys(password, "T0V8IM");

		WebElement login = ab.getAdatin_Method().getLogin();
		click(login);
	
//Adatin_Search
		
		WebElement location = ab.getAdatin_Search().getLocation();
		selectByVisibleText(location, "London");

		WebElement hotels = ab.getAdatin_Search().getHotels();
		selectByVisibleText(hotels, "Hotel Sunshine");

		WebElement roomtype = ab.getAdatin_Search().getRoomtype();
		selectByIndex(roomtype, 3);

		WebElement room_no = ab.getAdatin_Search().getRoom_no();
		selectByIndex(room_no, 1);

		WebElement check_in = ab.getAdatin_Search().getCheck_in();
		clear(check_in);
		sendkeys(check_in, "30/09/2022");

		WebElement check_out = ab.getAdatin_Search().getCheck_out();
		clear(check_out);
		sendkeys(check_out, "05/10/2022");

		WebElement adult_room = ab.getAdatin_Search().getAdult_room();
		selectByIndex(adult_room, 4);

		WebElement child_room = ab.getAdatin_Search().getChild_room();
		selectByVisibleText(child_room, "1 - One");

		WebElement search = ab.getAdatin_Search().getSearch();
		click(search);

		WebElement select = ab.getAdatin_Search().getSelect();
		click(select);
		WebElement continue1 = ab.getAdatin_Search().getContinue();
		click(continue1);

	//Adatin_book	
		
		WebElement firstname = ab.getAdatin_book().getFirstname();
		sendkeys(firstname, "kaameshbose");
		
		WebElement lastname = ab.getAdatin_book().getLastname();
		sendkeys(lastname, "H");
		
		WebElement address = ab.getAdatin_book().getAddress();
		sendkeys(address, "No-22 Ramakrishna Nagar, Kanchipuram. ");
		
		WebElement card_no = ab.getAdatin_book().getCard_no();
		sendkeys(card_no, "5477 4392 2225 1705");
		
		WebElement card_type = ab.getAdatin_book().getCard_type();
		selectByIndex(card_type, 3);
		
		WebElement exp_month = ab.getAdatin_book().getExp_month();
		selectByIndex(exp_month, 11);
	
		WebElement exp_yr = ab.getAdatin_book().getExp_yr();
		selectByIndex(exp_yr, 10);
		
		WebElement cvv = ab.getAdatin_book().getCvv();
		sendkeys(cvv, "437");
		
		WebElement book_now = ab.getAdatin_book().getBook_now();
		click(book_now);
	
	}

}
	
	

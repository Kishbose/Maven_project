package com.mvnConcepts.Maven_Project;

import org.openqa.selenium.WebElement;

import com.bassclass.Base;

import Adactin.Adatin_Method;
import Adactin.Adatin_Search;
import Adactin.Adatin_book;

public class Runner_cls extends Base {

	public static void main(String[] args) {

		BrowserLaunch();
		urlLauch("https://adactinhotelapp.com/");

		Adatin_Method ab = new Adatin_Method(driver);

		WebElement username = ab.getUsername();
		sendkeys(username, "kishbose");

		WebElement password = ab.getPassword();
		sendkeys(password, "T0V8IM");

		WebElement login = ab.getLogin();
		click(login);

		Adatin_Search as = new Adatin_Search(driver);

		WebElement location = as.getLocation();
		selectByVisibleText(location, "London");

		WebElement hotels = as.getHotels();
		selectByVisibleText(hotels, "Hotel Sunshine");

		WebElement roomtype = as.getRoomtype();
		selectByIndex(roomtype, 3);

		WebElement room_no = as.getRoom_no();
		selectByIndex(room_no, 1);

		WebElement check_in = as.getCheck_in();
		clear(check_in);
		sendkeys(check_in, "30/09/2022");

		WebElement check_out = as.getCheck_out();
		clear(check_out);
		sendkeys(check_out, "05/10/2022");

		WebElement adult_room = as.getAdult_room();
		selectByIndex(adult_room, 4);

		WebElement child_room = as.getChild_room();
		selectByVisibleText(child_room, "1 - One");

		WebElement search = as.getSearch();
		click(search);

		WebElement select = as.getSelect();
		click(select);
		WebElement continue1 = as.getContinue();
		click(continue1);

		Adatin_book ab1 = new Adatin_book(driver);
		
		WebElement firstname = ab1.getFirstname();
		sendkeys(firstname, "kaameshbose");
		
		WebElement lastname = ab1.getLastname();
		sendkeys(lastname, "H");
		
		WebElement address = ab1.getAddress();
		sendkeys(address, "No-22 Ramakrishna Nagar, Kanchipuram. ");
		
		WebElement card_no = ab1.getCard_no();
		sendkeys(card_no, "5477 4392 2225 1705");
		
		WebElement card_type = ab1.getCard_type();
		selectByIndex(card_type, 3);
		
		WebElement exp_month = ab1.getExp_month();
		selectByIndex(exp_month, 11);
	
		WebElement exp_yr = ab1.getExp_yr();
		selectByIndex(exp_yr, 10);
		
		WebElement cvv = ab1.getCvv();
		sendkeys(cvv, "437");
		
		WebElement book_now = ab1.getBook_now();
		click(book_now);

	}

	
		
	

	

}

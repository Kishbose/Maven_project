package Booking_Task;

import org.openqa.selenium.WebDriver;

public class SwagLabs_Objectmanager_Bass {
	
	public static WebDriver driver;
		
	private Book_Login b_login;
	
	private Book_check b_check;
		
	private Book_Search b_Search;

	public SwagLabs_Objectmanager_Bass(WebDriver driver2) {
		this.driver =driver2;
	}

	public Book_Login getBook_Login() {
		if (b_login==null) {
		b_login = new Book_Login(driver);			
		}
		return b_login;
	}

	public Book_check getBook_check(){
		if (b_check==null) {
			b_check = new Book_check(driver);
		}
		return b_check;
	}

	public Book_Search getBook_Search() {
		if (b_Search==null) {
			b_Search = new Book_Search(driver);
		}
		return b_Search;
	}

}

package Adactin;

import org.openqa.selenium.WebDriver;

public class Adactin_Objectmanager_Base {
	
	public static WebDriver  driver;
	
	private Adatin_Method a_method;
	
	private Adatin_Search a_search;
	
	private Adatin_book a_book;
	
	public Adactin_Objectmanager_Base(WebDriver driver2) {
		this.driver =driver2;	
}
	public Adatin_Method getAdatin_Method() {
		if (a_method==null) {
		a_method = new Adatin_Method(driver);
		}
		return a_method;
}
	public Adatin_Search getAdatin_Search() {
		if (a_search==null) {
		a_search = new Adatin_Search(driver);
		}
		return a_search;
}
	public Adatin_book getAdatin_book() {
		if (a_book==null) {
		a_book = new Adatin_book(driver);
		}
		return a_book;
}

}

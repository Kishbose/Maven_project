package Booking_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Search {
	
	public  WebDriver driver;
		
	@FindBy(id=("first-name"))
	private WebElement name;
	
	@FindBy(id=("last-name"))
	private WebElement lastname;
	
	@FindBy(id=("postal-code"))
	private WebElement code;
	
	@FindBy(id=("continue"))
	private WebElement continue1;
	
	@FindBy(id=("finish"))
	private WebElement finish;

	public Book_Search(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public  WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getCode() {
		return code;
	}

	public void setCode(WebElement code) {
		this.code = code;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	public void setContinue1(WebElement continue1) {
		this.continue1 = continue1;
	}

	public WebElement getFinish() {
		return finish;
	}

	public void setFinish(WebElement finish) {
		this.finish = finish;
	}
	
	

}

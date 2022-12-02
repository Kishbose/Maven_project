package Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Adatin_book {

	public WebDriver driver;

	@FindBy(className=("reg_input"))
	private WebElement Firstname;

	@FindBy(id=("last_name"))
	private WebElement Lastname;

	@FindBy(id=("address"))
	private WebElement Address;

	@FindBy(xpath=("//input[contains(@maxlength,'16')]"))
	private WebElement card_no;

	@FindBy(id=("cc_type"))
	private WebElement card_type;

	@FindBy(name=("cc_exp_month"))
	private WebElement exp_month;

	@FindBy(id=("cc_exp_year"))
	private WebElement exp_yr;
	
	@FindBy(id=("cc_cvv"))
	private WebElement cvv;
	
	@FindBy(id=("book_now"))
	private WebElement book_now;
	
	public Adatin_book(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public void setFirstname(WebElement firstname) {
		Firstname = firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public void setLastname(WebElement lastname) {
		Lastname = lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public void setAddress(WebElement address) {
		Address = address;
	}

	public WebElement getCard_no() {
		return card_no;
	}

	public void setCard_no(WebElement card_no) {
		this.card_no = card_no;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public void setCard_type(WebElement card_type) {
		this.card_type = card_type;
	}

	public WebElement getExp_month() {
		return exp_month;
	}

	public void setExp_month(WebElement exp_month) {
		this.exp_month = exp_month;
	}

	public WebElement getExp_yr() {
		return exp_yr;
	}

	public void setExp_yr(WebElement exp_yr) {
		this.exp_yr = exp_yr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public void setBook_now(WebElement book_now) {
		this.book_now = book_now;
	}

	
	
//	@FindBy(id=("Location"))
//	private WebElement location;
//	
//	@FindBy(id=("Location"))
//	private WebElement location;
//	
//	@FindBy(id=("Location"))
//	private WebElement location;
//	
//	@FindBy(id=("Location"))
//	private WebElement location;
//	
//	@FindBy(id=("Location"))
//	
//	

}

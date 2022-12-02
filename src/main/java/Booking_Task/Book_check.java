package Booking_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_check {
	
	public  WebDriver driver;
		
	@FindBy(xpath=("//img[contains(@alt,'Jacket')]"))
	private WebElement Jacket;
	
	@FindBy(id=("add-to-cart-sauce-labs-fleece-jacket"))
	private WebElement addcart;
		
	@FindBy(className=("shopping_cart_link"))
	private WebElement cartlink;

    @FindBy(id=("checkout")) 
	private WebElement checkout;

	public Book_check(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public  WebDriver getDriver() {
		return driver;
	}

	public  void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getJacket() {
		return Jacket;
	}

	public void setJacket(WebElement jacket) {
		Jacket = jacket;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public void setAddcart(WebElement addcart) {
		this.addcart = addcart;
	}

	public WebElement getCartlink() {
		return cartlink;
	}

	public void setCartlink(WebElement cartlink) {
		this.cartlink = cartlink;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}


}
	



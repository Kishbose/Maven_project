package Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adatin_Search {

	public WebDriver driver;
	
	@FindBy(name=("location"))
	private WebElement location;
	
	@FindBy(id=("hotels"))
	private WebElement hotels;
	
	@FindBy(xpath=("//select[@name='room_type']"))
	private WebElement roomtype;
	
	@FindBy(id=("room_nos"))
	private WebElement room_no;
	
	@FindBy(xpath=("//input[@id='datepick_in']"))
	private WebElement check_in;
	
	@FindBy(xpath=("//input[contains(@name,'out')]"))
	private WebElement check_out;
	
	@FindBy(xpath=("//select[contains(@id,'adult_room')]"))
	private WebElement adult_room;
	
	@FindBy(name=("child_room"))
	private WebElement child_room;

	@FindBy(className=("reg_button"))
	private WebElement search;
	
	@FindBy(name=("radiobutton_0"))
	private WebElement select;

	@FindBy(xpath=("//input[@id='continue']"))
	private WebElement Continue;

		
	public WebElement getSelect() {
		return select;
	}
	public void setSelect(WebElement select) {
		this.select = select;
	}
	public WebElement getContinue() {
		return Continue;
	}
	public void setContinue(WebElement continue1) {
		Continue = continue1;
	}
	public Adatin_Search(WebDriver driver2) {
		 this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getLocation() {
		return location;
	}
	public void setLocation(WebElement location) {
		this.location = location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}
	public WebElement getRoom_no() {
		return room_no;
	}
	public void setRoom_no(WebElement room_no) {
		this.room_no = room_no;
	}
	public WebElement getCheck_in() {
		return check_in;
	}
	public void setCheck_in(WebElement check_in) {
		this.check_in = check_in;
	}
	public WebElement getCheck_out() {
		return check_out;
	}
	public void setCheck_out(WebElement check_out) {
		this.check_out = check_out;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public void setAdult_room(WebElement adult_room) {
		this.adult_room = adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public void setChild_room(WebElement child_room) {
		this.child_room = child_room;
	}
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}

	


	

	
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


package com.Cucumber_StepDef;

import com.bassclass.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition  extends Base {
	
	@Given("^To Launch a url$")
	public void to_Launch_a_url() throws Throwable {
	   BrowserLaunch();
	   urlLauch("https://www.google.com/");
		
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	   
	}

	@When("^User enters \"([^\"]*)\"$")
	public void user_enters(String arg1) throws Throwable {
	   
	}

	@When("^User enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
	  
	}

	@Then("^displayed Login Successfully$")
	public void displayed_Login_Successfully() throws Throwable {
	    
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	   
	}

	@Then("^displayed LogOut Successfully$")
	public void displayed_LogOut_Successfully() throws Throwable {
	  
	}
	



}
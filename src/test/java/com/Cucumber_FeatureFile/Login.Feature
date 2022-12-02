

Feature: Login Action


  
  Scenario: Successful Login 
    Given To Launch a url
    When User Navigate to LogIn Page
	  When  User enters "UserName" 
	  And User enter "Password"
	  Then displayed Login Successfully
  
 Scenario: Logout Successful
    When User LogOut from the Application
	  Then displayed LogOut Successfully



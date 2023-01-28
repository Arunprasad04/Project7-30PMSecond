package com.stepdefinition;

import org.excel.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

@Given("user is on facebook page")
public void user_is_on_facebook_page() {
	getDriver("chrome");
	url("https://www.facebook.com/");

}

@When("user enters username and password")
public void user_enters_username_and_password() {
   WebElement user = locator("id","email");
   textSend(user,"Test1@gmail.com");
   WebElement pwd = locator("id","pass");
   textSend(pwd,"89898787");
}

@Then("user click the login button")
public void user_click_the_login_button() {
	 WebElement login = locator("name","login");
	 buttonClick(login);
  
}
@When("user enters username {string} and password {string}")
public void user_enters_username_and_password(String s1, String s2) {
	  WebElement user = locator("id","email");
	   textSend(user,s1);
	   WebElement pwd = locator("id","pass");
	   textSend(pwd,s2);
}

@Then("Success message is displayed")
public void success_message_is_displayed() {

System.out.println("Success message is displayed");
}

}

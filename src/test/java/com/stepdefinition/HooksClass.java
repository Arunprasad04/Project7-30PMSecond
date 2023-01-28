package com.stepdefinition;

import org.excel.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//Hooks with tags
public class HooksClass extends BaseClass {
	@Before("@smoke")
	public void beforeScenario() {
		getDriver("chrome");
		url("https://www.facebook.com/");

	}


	@After("@smoke")
	public void afterScenario() {
		quitBrowser();

	}
}

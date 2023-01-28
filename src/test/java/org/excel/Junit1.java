package org.excel;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit1 extends BaseClass {
	
	@Test
	public void validate_the_userName_and_pasword_field() {
		getDriver("chrome");
		url("https://www.facebook.com/");
		POM p=new POM();
		WebElement userName = p.getUserName();
		textSend(userName,"Test1@gmail.com");
		WebElement passWord = p.getPassWord();
		textSend(passWord,"487845454");
		WebElement logIn = p.getLogIn();
		buttonClick(logIn);
	}
}

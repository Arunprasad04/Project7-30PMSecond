package org.excel;

import org.openqa.selenium.WebElement;

public class Test extends BaseClass {
	public static void main(String[] args) {
		getDriver("chrome");
		url("https://www.facebook.com/");
		POM p=new POM();
		WebElement userName = p.getUserName();
		textSend(userName,"test1@gmail.com");
		WebElement passWord = p.getPassWord();
		textSend(passWord,"154842121");
		WebElement logIn = p.getLogIn();
		buttonClick(logIn);
	}

}

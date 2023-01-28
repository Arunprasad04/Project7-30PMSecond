package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POM extends BaseClass {

	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
	private WebElement userName;
	@FindBys({@FindBy(name="pass"),@FindBy(xpath="//input[@id='pass']")})
	private WebElement passWord;
	@FindBys({@FindBy(name="login"),@FindBy(xpath="//button[@type='submit']")})
	private WebElement logIn;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLogIn() {
		return logIn;
	}
	public POM() {
		PageFactory.initElements(driver, this);
	}
}

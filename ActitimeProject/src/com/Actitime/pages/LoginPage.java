package com.Actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.GenericLib.BaseTest;

public class LoginPage {
	@FindBy(id="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath="//div[text()='Login ']") private WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void login(String un, String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginBtn.click();
	}

	public WebElement getUntb() {
		return untb;
	}

	public WebElement getPwtb() {
		return pwtb;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}

package com.Actitime.Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenericLib.BaseTest;
import com.Actitime.GenericLib.FileLib;
import com.Actitime.GenericLib.WebDriverCommonLib;
import com.Actitime.pages.LoginPage;

@Listeners(com.Actitime.GenericLib.MyListeners.class)
public class ValidLogin extends BaseTest {
	
	@Test
	public void validLoginTest() throws Throwable
	{
		//Open the browser
		//enter the test URL
		//Verify LoginPage is Displayed
		FileLib flib=new FileLib();
		
		
		//Login to App
		LoginPage lp=new LoginPage();
		lp.login(flib.readPropertyData(PROP_PATH, "username"), 
				flib.readPropertyData(PROP_PATH, "password"));
		//Verify Home Page is Displayed
		 WebDriverCommonLib wlib=new WebDriverCommonLib();
		 wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		 wlib.verify(wlib.getPageTitle(), 
				 flib.readPropertyData(PROP_PATH, "homeTitle"), "Enter Time Track Page");
	}
}

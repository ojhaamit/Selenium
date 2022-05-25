package com.swaglabs.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.swaglabs.qa.base.BasePageTest;
import com.swaglabs.qa.utils.Constants;

public class LogOutPageTest extends BasePageTest{
	
	@BeforeClass
	public void logOutPageSetUp() {
		productsPage = logInPage.doLogIn(prop.getProperty("username"), prop.getProperty("password"));
		logOutPage = productsPage.returnLogOutPage();
	}
	
	@Test
	public void validateLogOut() {
		logOutPage.doLogOut();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, Constants.SIGN_IN_PAGE_URL);
	}

}

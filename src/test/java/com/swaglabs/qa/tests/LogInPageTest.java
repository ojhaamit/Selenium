package com.swaglabs.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs.qa.base.BasePageTest;
import com.swaglabs.qa.utils.Constants;

public class LogInPageTest extends BasePageTest{
	
	@Test
	public void validateTitleOfPage() {
		String title = logInPage.getTitleOfPage();
		Assert.assertEquals(title, Constants.SIGN_IN_PAGE_TITLE);
	}
	
	@Test
	public void validateLogIn(){
		logInPage.doLogIn(prop.getProperty("username"), prop.getProperty("password"));
	}

}

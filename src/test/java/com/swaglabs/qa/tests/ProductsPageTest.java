package com.swaglabs.qa.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.swaglabs.qa.base.BasePageTest;
import com.swaglabs.qa.utils.Constants;

public class ProductsPageTest extends BasePageTest{
	
	@BeforeClass
	public void productsPageSetup() {
		productsPage = logInPage.doLogIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void validatePageTitle() {
		String title = productsPage.productsPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, Constants.PRODUCTS_PAGE_TITLE);
	}

}

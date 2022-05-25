package com.swaglabs.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.swaglabs.qa.pages.LogInPage;
import com.swaglabs.qa.pages.LogOutPage;
import com.swaglabs.qa.pages.ProductsPage;

public class BasePageTest {
	public BasePage basePage;
	public Properties prop;
	public WebDriver driver;
	public LogInPage logInPage;
	public ProductsPage productsPage;
	public LogOutPage logOutPage;
	
	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.getProperties();
		String browser = prop.getProperty("browser");
		driver = basePage.initDriver(browser);
		logInPage = new LogInPage(driver);
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

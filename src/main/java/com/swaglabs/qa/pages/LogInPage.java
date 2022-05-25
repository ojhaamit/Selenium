package com.swaglabs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.swaglabs.qa.base.BasePage;

public class LogInPage extends BasePage{
	
	private WebDriver driver;
	
	private By userName = By.xpath("//input[@id='user-name']");
	private By password = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//input[@id='login-button']");
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitleOfPage() {
		String title = driver.getTitle();
		return title;
	}
	
	public ProductsPage doLogIn(String UserName, String Password) {
		driver.findElement(userName).sendKeys(UserName);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(loginButton).click();
		return new ProductsPage(driver);
	}

}

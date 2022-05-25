package com.swaglabs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.swaglabs.qa.base.BasePage;

public class ProductsPage extends BasePage{
	private WebDriver driver;
	
	private By pageTitle = By.xpath("//span[@class='title']");
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String productsPageTitle() {
		String titleOfPage = driver.findElement(pageTitle).getText();
		return titleOfPage;
	}
	
	public LogOutPage returnLogOutPage() {
		return new LogOutPage(driver);
	}

}

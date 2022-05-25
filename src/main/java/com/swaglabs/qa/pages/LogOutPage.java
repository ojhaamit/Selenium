package com.swaglabs.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swaglabs.qa.base.BasePage;

public class LogOutPage extends BasePage{
	private WebDriver driver;
	
	private By logout = By.xpath("//a[@id='logout_sidebar_link']");
//	private By logout = By.xpath("//a[contains(text(), 'Logout')]");
//	private By menuButton = By.xpath("//button[contains(text(),'Open Menu')]");
	private By menuButton = By.xpath("//button[@id='react-burger-menu-btn']");
	
	public LogOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LogInPage doLogOut() {
		Actions mouseOver = new Actions(driver);
		WebElement burgerButton = driver.findElement(menuButton);
		WebElement logOutLink = driver.findElement(logout);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(menuButton));
		
		mouseOver.click(burgerButton).perform();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(logout));
		
		mouseOver.click(logOutLink).perform();
		
		return new LogInPage(driver);
	}

}

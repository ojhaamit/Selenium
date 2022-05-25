package com.swaglabs.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initDriver(String browser) {
		System.out.println("browser is " + browser);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public Properties getProperties() {
		prop = new Properties();
		FileInputStream fip;
		
		try {
			fip = new FileInputStream("./src/main/java/com/swaglabs/qa/config/config.properties");
			prop.load(fip);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}

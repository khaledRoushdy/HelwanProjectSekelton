package com.itworx.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName) {
		
		switch (browserName) {
		case "Firefox":

			if (driver == null)

			{
				driver = new FirefoxDriver();
			}
			break;

		case "Chrome":

			if (driver == null)

			{
				System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			break;
		}
		return driver;
	}

	public static void closeDriver(){
		
		if(driver != null){
			driver.quit();
			driver = null;
		}
	}
	
}

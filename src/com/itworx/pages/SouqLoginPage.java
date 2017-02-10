package com.itworx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.itworx.driver.Browser;

public class SouqLoginPage {

	public SouqLoginPage() {

	}

	private WebElement UserName() {
		return Browser.driver.findElement(By.id("email"));
	}

	private WebElement Password() {
		return Browser.driver.findElement(By.id("password"));
	}

	private WebElement Log_in() {
		return Browser.driver.findElement(By.id("siteLogin"));
	}
	
	private WebElement errorMessage(){
		return Browser.driver.findElement(By.xpath("//div[@id=\"flash-sess\"]/div/ul/li"));
	}

	public void login(String username, String password) {

		UserName().sendKeys(username);
		Password().sendKeys(password);
		Log_in().click();
	}

	public String getErrorMessage(){
		
		return errorMessage().getText();
	}
	
}

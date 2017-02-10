package com.itworx.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.itworx.driver.Browser;
import com.itworx.pages.SouqLoginPage;
import com.itworx.utilities.Messages;

public class SouqLoginTests extends BaseTest {

	private SouqLoginPage souqLoginPage;
	
	@Before
	public void setupLoginData(){
		
		souqLoginPage =new SouqLoginPage();
		Browser.driver.get("https://ssl.souq.com/eg-en/login.php");
	}
	
	@Test
	public void validLogin(){

	}
	
	@Test
	public void invalidLogin(){
		
	}
	
	@Test
	public void validWithEmptyCredentials(){
		
	}
	
}

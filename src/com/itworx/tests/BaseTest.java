package com.itworx.tests;

import org.junit.After;
import org.junit.Before;

import com.itworx.driver.Browser;

public class BaseTest {

	@Before
	public void setup(){
		Browser.getBrowser("Chrome");
	}
	
	@After
	public void teardown(){
		Browser.closeDriver();
	}
	
}

package com.opencart.testcases;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.opencart.base.Base;
import com.opencart.pages.HomePage;

public class TC_01 extends Base{
	
	HomePage home= new HomePage();
	private static Logger log = Logger.getLogger(Log.class.getName());
	public TC_01() {
		super();
	}
	@Test
	public void setUp() {
		System.out.println("Test");
		log.info("opening browser");
		initialization();
		log.info("click on my account");
		home.clickMyAccount();
		
	}
	
}

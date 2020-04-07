package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.base.Base;

public class HomePage extends Base{
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myaccount;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickMyAccount() {
		myaccount.click();
		System.out.println("clicked my account");
	}
}

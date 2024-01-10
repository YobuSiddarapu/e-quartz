package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class ForgotPasswordlinkVisible extends TestBase {
	
	@FindBy(className = "font-size-sm")
	WebElement passwordlink;
	
	public ForgotPasswordlinkVisible() {
		PageFactory.initElements(driver, this);
	}
	public void Setup() {
		passwordlink.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	

}

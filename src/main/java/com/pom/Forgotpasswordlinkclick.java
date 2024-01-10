package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Forgotpasswordlinkclick extends TestBase{
	@FindBy(className = "font-size-sm")
	WebElement passwordlink;
	
	public  Forgotpasswordlinkclick() {
		// TODO Auto-generated constructor stub
	
		PageFactory.initElements(driver, this);
	}
	public void Setup1() {
		passwordlink.click();
	}
	

	
	
	
}

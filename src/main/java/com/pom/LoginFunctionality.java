package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginFunctionality extends TestBase {
	
	@FindBy(id = "si-email")
	WebElement id;
	@FindBy(id="si-password")
	WebElement pass;
	@FindBy(className = "btn btn--primary btn-block btn-shadow")
	WebElement btn;
	
	public LoginFunctionality() {
		PageFactory.initElements(driver, this);
	}
	public void Verifylogin() {
		id.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		btn.click();
	}
	

	
	
	
}

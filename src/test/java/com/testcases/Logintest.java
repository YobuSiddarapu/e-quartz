package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.LoginFunctionality;

public class Logintest extends TestBase{
	
	LoginFunctionality lf;
	
	public Logintest() {
		super();
	}
	@BeforeMethod
	public void setup() {

		initialization();

		lf = new LoginFunctionality();
		

	}
	@Test
	public void loginvalidation() {
		lf.Verifylogin();
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://e-quarz.com/");
		

	}
	@AfterMethod
	public void teardown() {
		 extentreports.flush();
		//driver.close();

	}

}

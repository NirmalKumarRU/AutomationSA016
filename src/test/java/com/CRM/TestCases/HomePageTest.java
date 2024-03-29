package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass 
{
	
	@Test(priority=1)
	public void verifyUrl()
	{
		String curl=hp.getAppUrl();
		Assert.assertTrue(curl.contains("crm"), "Url is Wrong");  // if assertTrue is true then next line will be visible
		System.out.println("Url is valid");
	}
	
	@Test(priority=2)
	public void verifyTitle()
	{
		Assert.assertTrue(hp.getAppTitle().contains("Service"), "Title is not matched");
		System.out.println("Title is matched :" +hp.getAppTitle());
	}
	
	@Test(priority=3)
	public void verifySignIn()
	{
		hp.getSignIn();
		Assert.assertTrue(hp.getAppUrl().contains("login"), "Test Fail login page not opened");
		System.out.println("Test Pass : login page opened");
	}

}

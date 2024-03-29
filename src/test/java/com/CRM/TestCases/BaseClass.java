package com.CRM.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.CRM.Pages.*;

public class BaseClass {
	public WebDriver d;
	public HomePage hp;
	public LoginPage lp;
	
	@BeforeTest
	public void setUp()
	{
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("https://automationplayground.com/crm/");
		
		hp=new HomePage(d);
		lp=new LoginPage(d);
	}
	
	@BeforeClass
	public void pageSetUp()
	{
		hp.getSignIn();
	}

}

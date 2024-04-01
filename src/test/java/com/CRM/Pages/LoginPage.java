package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Config.Utility;

public class LoginPage {
	private WebDriver d;
	
	public LoginPage(WebDriver d)  //base class
	{
		this.d=d;
	}
	
	By email=By.id("email-id");
	By pas=By.id("password");
	By btn=By.id("submit-id");
	
    public void doLogin(String em,String ps)
    {
    	d.findElement(email).sendKeys(em);
    	d.findElement(pas).sendKeys(ps);
    	Utility.capture(d);
    	d.findElement(btn).click();
    	
    }
}

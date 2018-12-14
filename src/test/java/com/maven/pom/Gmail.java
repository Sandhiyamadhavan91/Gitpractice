package com.maven.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {

	public static WebDriver  driver;
	
	public Gmail(WebDriver IDDriver) {
		this.driver=IDDriver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//input[@type='email']")
	private WebElement Mailid;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement Nextclick1;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement Nextclick2;

	public WebElement getMailid() {
		return Mailid;
	}

	public WebElement getNextclick1() {
		return Nextclick1;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getNextclick2() {
		return Nextclick2;
	}
	
}

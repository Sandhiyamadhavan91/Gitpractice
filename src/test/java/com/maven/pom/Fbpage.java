package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpage {

	
	public static WebDriver driver;

	public Fbpage(WebDriver ldDriver) {
		this.driver=ldDriver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='email']")
			private WebElement UserName;
	
	@FindBy(xpath ="(//input[@type='password'])[1]")
	private WebElement password;

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return password;
	}

	
}

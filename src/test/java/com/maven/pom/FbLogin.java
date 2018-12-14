package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin {

	public static WebDriver driver;

	public FbLogin(WebDriver ldDriver) {
		this.driver=ldDriver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "firstname")
			private WebElement UserName;
	
	@FindBy(name= "lastname")
	private WebElement LastName;

	@FindBy(xpath=" //input[@name='reg_email__']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement password;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement Bdate;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement Bmonth;
	
	
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement Byear;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement Fradiobtn;

	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement select;

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBdate() {
		return Bdate;
	}

	public WebElement getBmonth() {
		return Bmonth;
	}

	public WebElement getByear() {
		return Byear;
	}

	public WebElement getFradiobtn() {
		return Fradiobtn;
	}

	public WebElement getSelect() {
		return select;
	}

	
	
	
}

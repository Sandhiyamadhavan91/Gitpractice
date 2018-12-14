package com.maven.test;

import org.openqa.selenium.WebDriver;

import com.maven.Resourse.Base;
import com.maven.pom.FbLogin;

public class Fblogintest extends Base {
	static WebDriver driver;
	static FbLogin X;
	
	public static void main(String[] args) {
		driver=launchDriver("Chrome");
		
		geturl("https://www.facebook.com/");
		
		
		X =new FbLogin(driver);
		Settext(X.getUserName(), "Vivedha");
		Settext(X.getLastName(), "Hari");
		Settext(X.getEmail(), "vivihari95@gmail.com");
		Settext(X.getPassword(), "vivi1234");
		
	}
	
	
	

}

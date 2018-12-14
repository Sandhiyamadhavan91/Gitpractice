package com.testng;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void openBrowser() {
		System.out.println("Open Browser");
	}

	@Test(dependsOnMethods="login")
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@Test(dependsOnMethods="openBrowser")
	public void login() {
		System.out.println("Login into the App");
	}


}
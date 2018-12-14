package com.Junit;
import java.net.URL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import com.maven.Resourse.Base;
import com.maven.pom.FbLogin;
import com.maven.pom.Fbpage;
import com.maven.pom.Gmail;

@RunWith(Suite.class)
@SuiteClasses({})

public class AllTests extends Base {
	static WebDriver driver;
	Fbpage X;
	Gmail Y;
		@BeforeClass
	public static void Browser() {
		driver = launchDriver("Chrome");
	}
	@Before
		public void url() {
		geturl("https://www.facebook.com/");
		
	}
	@Test
	public void Login(){
		X = new  Fbpage(driver);
		Assert.assertEquals("Facebook – log in or sign up", getTitle());
		Settext(X.getUserName(), "msandhiya@gmail.com");
		Assert.assertEquals("msandhiya@gmail.com",getattribute(X.getUserName(),"value"));
		Settext(X.getPassword(), "XYZABC");
		Assert.assertEquals("XYZABC", getattribute(X.getPassword(),"value"));
	Implicitwait(5);
	
	}
	
		@Test
	public void Glogin() {
		geturl("https://accounts.google.com/");
		Y = new Gmail(driver);
		Settext(Y.getMailid(), "msandhiya@gmail.com");
		Assert.assertEquals("msandhiya@gmail.com",getattribute(Y.getMailid(),"value"));
		click(Y.getNextclick1());
		Settext(Y.getPassword(), "abc123");
		Assert.assertEquals("abc123",getattribute(Y.getPassword(), "value"));
		click(Y.getNextclick2());
		Implicitwait(5);
	}

	@After
	public void close1() throws InterruptedException {
		
		//Thread.sleep(5000);
		//driver.close();
	}
	
	@AfterClass
	
	public static void quit() {
		//driver.quit();
	}
	
}

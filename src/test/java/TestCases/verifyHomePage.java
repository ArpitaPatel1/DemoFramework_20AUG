package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.HomePage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import junit.framework.Assert;

public class verifyHomePage {

	WebDriver driver;
	
	@BeforeMethod
	public  void setUp(){
		
		driver = BrowserFactory.getBrowser("Firefox");
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	
	@Test
	public void testHomePage(){
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		
		String title = home.getApplicationTitle();
		
		Assert.assertTrue(title.contains("Avactis Demo Store"));
	}
	
	@AfterMethod
	public void tearDown(){
		BrowserFactory.closeBrowser(driver);
		
	}

}

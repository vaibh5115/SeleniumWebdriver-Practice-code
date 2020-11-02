package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageObjectTestCases 
{
	WebDriver driver;
	
	@BeforeClass
	public void setupDriver()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Study\\eclipse_workspace\\Selenium Jar files\\Selenium browser drivers\\chromedriver.exe");
		driver=new ChromeDriver(); /// opens the browser
		driver.get("http://newtours.demoaut.com/");
		
	}
	
	@Test
	public void TC1_loginPage()
	{
		PageObjectClass obj=new PageObjectClass(driver);
		
		obj.setUserName("mercury");
		obj.setPass("mercury");
		obj.clickSubmitBtn();	
		
		if(driver.getPageSource().contains("Welcome: Mercury Tours"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
	}
	
}

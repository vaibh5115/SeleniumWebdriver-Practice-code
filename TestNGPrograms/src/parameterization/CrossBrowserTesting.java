package parameterization;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{
	WebDriver driver;
	
	@Parameters("x")
	@Test(priority=1)
	public void launchBrowser(String br)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Study\\eclipse_workspace\\Selenium Jar files\\Selenium browser drivers\\chromedriver.exe");
			driver=new ChromeDriver();		
		}
		
		else if( br.equals("Microsoft Edge"))
		{
			System.setProperty("webdriver.edge.driver","E:\\Study\\eclipse_workspace\\Selenium Jar files\\Selenium browser drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.get("http://newtours.demoaut.com/");
				
	}
	
	@Test(priority=2)
	public void verifyTitle()
	{
		Assert.assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
	}
	
	@Test(priority=3)
	public void closeBrowser()
	{
		driver.close();
	}
	

}

package TestNGDDTUsingDataProvider;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTUsingDataProvider 
{
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser()
	{
			System.setProperty("webdriver.chrome.driver","E:\\Study\\eclipse_workspace\\Selenium Jar files\\Selenium browser drivers\\chromedriver.exe");
			driver=new ChromeDriver();			
	}
	
	
	@Test(dataProvider="users")
	public void logintest(String uname, String pwd)
	{
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		
	}
	
	
	@DataProvider(name="users")
	String[][] loginData()
	{
		String arr[][]= {
				{"mercury","mercury"},
				{"abc","xyzw"},
				{"mercury1","mercury1"}
				};
		return arr;
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	

}

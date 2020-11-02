package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyAccountLoginStepDefinitions 
{

	public WebDriver driver=null;
	
	@Given("^Open browser$")
	public void open_browser() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Study\\eclipse_workspace\\Browser_drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable 
	{
	   driver.get(url);
	}

	@And("^Click on My Account link$")
	public void click_on_My_Account_link() throws Throwable 
	{
	   driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
	   Thread.sleep(5000);
	}

	/* @And("^Enter registered user name and password$")
	public void enter_registered_user_name_and_password() throws Throwable 
	{
	    driver.findElement(By.name("username")).sendKeys("vaibham@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Test@selenium123");    
	}*/
	
	/*@When("^Enter registered user name \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_registered_user_name_and_password(String user, String pwd) throws Throwable 
	{
		driver.findElement(By.name("username")).sendKeys(user);
	    driver.findElement(By.name("password")).sendKeys(pwd);       
	}*/
		
	/*//data table reading without header
	@When("^Enter registered user name and pass$")
	public void enter_registered_user_name_and_pass(DataTable credentials) throws Throwable 
	{
		List<List<String>> data=credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		
	}*/
	
	//data table reading with header
	@When("^Enter registered user name and pass$")
	public void enter_registered_user_name_and_pass(DataTable credentials) throws Throwable 
	{
		List<Map<String,String>> data=credentials.asMaps(String.class, String.class);
		driver.findElement(By.name("username")).sendKeys(data.get(0).get("user name"));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
		
	}
	
	
	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable
	{
	    driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
	}
	
	@Then("^User logged in successfully$")
	public void user_logged_in_successfully() throws Throwable
	{
		String CapText=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
		Assert.assertEquals(true, CapText.contains("vaibham"));	
		driver.close();
	}
	
	/*@Then("^Verify login$")
	public void verify_login() throws Throwable 
	{
		String CapText=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong")).getText();
	
	   if(CapText.contains("ERROR"))
	   {
		   Assert.assertTrue("Invalid Input- Error page",true);
	   }
	   else
	   {
		   Assert.assertTrue(false);
	   }
	}*/
	   
	
	@Then("^close all browser$")
	public void close_all_browser() throws Throwable 
	{
	   driver.quit(); 
	}

	
	
}

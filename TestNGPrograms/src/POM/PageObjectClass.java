package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//this class contains page object identification methods and action methods

public class PageObjectClass 
{
	WebDriver loacalDriver;
	
	//step-1: creating constructor
	PageObjectClass(WebDriver remoteDriver)
	{
		loacalDriver=remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}
	
	//step-2: page object identification methods
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")
	@CacheLookup // used to increase performance : when welogin 1st time then all data is stored in cache and next time it will directly pickup the page object ele data from cache 
	WebElement txtusername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpwd;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	@CacheLookup
	WebElement btnlogin;
	
	//step 3: action methods
	
	public void setUserName(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setPass(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	
	public void clickSubmitBtn()
	{
		btnlogin.click();
	}
	
}

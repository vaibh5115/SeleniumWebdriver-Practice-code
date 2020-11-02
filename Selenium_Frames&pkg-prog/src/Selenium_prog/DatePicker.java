package Selenium_prog;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static WebDriver driver;
	
	/*public static void selectCurrDate()
	{   
	Calendar cal=Calendar.getInstance();
	int d=cal.get(Calendar.DATE); //returns the curr date in integer format.
	String date=String.valueOf(d); //convert into string.
	driver.findElement(By.linkText(date)).click();
	}*/
	
	/*public static void selectFutureDate(String d, String m)
	{
		Calendar cal=Calendar.getInstance();
		int curr_mon=cal.get(Calendar.MONTH)+1; //returns the curr month in integer format.(jan=0 means month value starts from 0)
		for(int i=curr_mon;i>=1;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click(); //click on next month arrow.
			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText(); //getting month.
			
			if(month.equals(curr_mon))
			{
				driver.findElement(By.linkText(d)).click();
				break;
			}	
			
		}
	}*/
		
	
	public static void selectPastDate(String d, String m  )
	{
	
		Calendar cal=Calendar.getInstance();
		int curr_mon=cal.get(Calendar.MONTH)+1; //returns the curr month in integer format.(jan=0 means month value starts from 0)
		for(int i=curr_mon;i>=1;i--)
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click(); //click on prev month arrow.
			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText(); //getting month.
			
			if(month.equals(curr_mon))
			{
				driver.findElement(By.linkText(d)).click();
				break;
			}
		
		}
	}
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//String month="June";
		//String date="25";
		
		String month="April";
		String date="2";
		
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		//selectCurrDate();
		
		
		//String year="2020";
		
		//selectFutureDate(date,month);
		selectPastDate(date,month);
	}
}
	
	
	
	
	

package DDT_HashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DDT_1.XLUtils;

public class DDTUsingHashMap
{
	static HashMap<String,String>loginTestData()
	{
		HashMap<String,String> hm= new HashMap<String,String>();
		
		hm.put("usr1", "mercury@mercury");
		hm.put("usr2", "mercury1@mercury2");
		hm.put("usr3", "mercury2@mercury2");
		
		return hm;	
	}
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stu
		
		System.setProperty("webdriver.chrome.driver","E:\\Study\\eclipse_workspace\\Selenium Jar files\\Selenium browser drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); /// opens the browser
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.manage().window().maximize();
		
		String credentials=loginTestData().get("usr3");
		
		String usrArr[]=credentials.split("@");
		
		driver.findElement(By.name("userName")).sendKeys(usrArr[0]);
		driver.findElement(By.name("password")).sendKeys(usrArr[1]);
		driver.findElement(By.name("login")).click();
		
		if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
		{
			System.out.println("Test case passed");
		}
		
		else 
		{
			System.out.println("Test case failed");
		}
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.close();

	}

}

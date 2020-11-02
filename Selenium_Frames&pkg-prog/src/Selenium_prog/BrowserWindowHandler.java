package Selenium_prog;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandler {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		Set <String> handles=driver.getWindowHandles();
		
		for(String s:handles)
		{
			//System.out.println("window handles:"+s);
			String title=driver.switchTo().window(s).getTitle();
			System.out.println("title of the page is:"+title);
			
			if(title.equals("Sakinalium | Home"))
			{
				driver.close();
			}
		}

	}

}

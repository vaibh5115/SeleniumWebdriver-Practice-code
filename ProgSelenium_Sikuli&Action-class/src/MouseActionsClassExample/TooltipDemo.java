package MouseActionsClassExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement tooltip=driver.findElement(By.id("age"));
		
		String title=tooltip.getAttribute("title");
		System.out.println("text shown under tooltip is:"+title);
		
		if(title.equals("We ask for your age only for statistical purposes."))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}

	}

}

package MouseActionsClassExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PressingCombinationKeysKeyboardDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.CONTROL+"A").build().perform();

	}

}

package MouseActionsClassExample;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();// press a single key.
		Thread.sleep(3000);
		act.sendKeys(Keys.SPACE).build().perform();
		
	}

}

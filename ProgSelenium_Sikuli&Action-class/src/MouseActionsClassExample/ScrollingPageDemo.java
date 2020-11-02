package MouseActionsClassExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		//creating javascriptexecutor variable and assign driver object to js variable
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//1st approach: scroll till specified position.
		//js.executeScript("window.scrollBy(0,800)","");
		
		//2nd approach: scroll till element is identified
		//WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		//js.executeScript("arguments[o].scrollIntoView();",flag);
		
		//3rd approach: scroll till specified position.
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}

package MouseActionsClassExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableElementDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement resizableEle=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		//Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.moveToElement(resizableEle).dragAndDropBy(resizableEle,100,80).build().perform();
	}

}

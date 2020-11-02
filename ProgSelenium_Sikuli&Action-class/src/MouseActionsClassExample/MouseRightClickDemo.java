package MouseActionsClassExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions act=new Actions(driver);
		act.contextClick(button).build().perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[4]/span")).click();
		
		Thread.sleep(5000);
		Alert a=driver.switchTo().alert();
		System.out.println("Message written in alert box is:"+a.getText());
		a.accept();
		
		
		

	}

}

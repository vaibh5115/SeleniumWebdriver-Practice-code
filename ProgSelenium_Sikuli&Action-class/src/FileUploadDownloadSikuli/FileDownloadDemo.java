package FileUploadDownloadSikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

	}

}

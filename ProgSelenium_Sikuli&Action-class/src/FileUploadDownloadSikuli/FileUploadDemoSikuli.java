package FileUploadDownloadSikuli;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadDemoSikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("imagesrc")).click();
		
		String imgFilepath="C:\\Users\\nikesh\\Pictures\\Screenshots\\";
		String uploadFilepath="C:\\Users\\nikesh\\Pictures\\Screenshots\\";
		
		Screen s=new Screen();
		
		Pattern fileInputTextBox=new Pattern(imgFilepath+"FileInputImage.PNG");
		Pattern openButton=new Pattern(imgFilepath+"OpenButton.PNG");
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextBox, 20);
		s.type(fileInputTextBox,uploadFilepath+"UploadFile.PNG");
		s.click(openButton);
		
		
		
		
	}

}

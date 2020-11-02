package FileUploadDownloadSikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload1 {

	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"photofile\"]")).click();
		
		Thread.sleep(5000);
		
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

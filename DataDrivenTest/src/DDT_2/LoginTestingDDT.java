package DDT_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DDT_1.XLUtils;

public class LoginTestingDDT {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Study\\eclipse_workspace\\Selenium Jar files\\Selenium browser drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); /// opens the browser
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.manage().window().maximize();
		
		String path="E:\\Study\\eclipse_workspace\\Selenium input files\\Login1.xlsx";
		
		DDT_1.XLUtils.setExcelFile(path,"Sheet1");
		
		int rowCount=XLUtils.getRowCount(path,"Sheet1");
		
		for(int r=1;r<=rowCount;r++)
		{
			String user_name= XLUtils.getCellData(path,"Sheet1",r,0);
			String pass= XLUtils.getCellData(path,"Sheet1",r,1);
			
			driver.findElement(By.name("userName")).sendKeys(user_name);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.name("login")).click();
			
			if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
			{
				System.out.println("Test case "+r+" passed");
				XLUtils.setCellData(path,"Sheet1",r,2,"Passed");
			}
			
			else 
			{
				System.out.println("Test case "+r+" failed");
				XLUtils.setCellData(path,"Sheet1",r,2,"Failed");
			}
			
			driver.findElement(By.linkText("Home")).click();
			
		}
		
		

	}

}

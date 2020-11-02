package DDT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Study\\eclipse_workspace\\Selenium Jar files\\Selenium browser drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); /// opens the browser
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		String path="E:\\Study\\eclipse_workspace\\Selenium input files\\Registration.xlsx";
		
		XLUtils.setExcelFile(path,"Sheet1");
		
		int rowCount=XLUtils.getRowCount(path,"Sheet1");
		
		for(int r=1;r<=rowCount;r++)
		{
			String first_name= XLUtils.getCellData(path,"Sheet1",r,0);
			String last_name= XLUtils.getCellData(path,"Sheet1",r,1);
			int phone_no=Integer.parseInt(XLUtils.getCellData(path,"Sheet1",r,2));
			String email_id= XLUtils.getCellData(path,"Sheet1",r,3);
			String address= XLUtils.getCellData(path,"Sheet1",r,4);
			String city= XLUtils.getCellData(path,"Sheet1",r,5);
			String state= XLUtils.getCellData(path,"Sheet1",r,6);
			int postal_code=Integer.parseInt(XLUtils.getCellData(path,"Sheet1",r,7));
			String Country= XLUtils.getCellData(path,"Sheet1",r,8);
			String user_name= XLUtils.getCellData(path,"Sheet1",r,9);
			String pass= XLUtils.getCellData(path,"Sheet1",r,10);
			
			driver.findElement(By.name("firstName")).sendKeys(first_name);
			driver.findElement(By.name("lastName")).sendKeys(last_name);
			driver.findElement(By.name("phone")).sendKeys(String.valueOf(phone_no));
			driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(email_id);
			driver.findElement(By.name("address1")).sendKeys(address);
			driver.findElement(By.name("city")).sendKeys(city);
			driver.findElement(By.name("state")).sendKeys(state);
			driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(postal_code));
			
			Select country_dd=new Select(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")));
			country_dd.selectByVisibleText(Country);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(user_name);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.name("confirmPassword")).sendKeys(pass);
			driver.findElement(By.name("register")).click();
			
			if(driver.getTitle().contains("Register: Mercury Tours"))
			{
				System.out.println("Registration Completed for  " + r + " record");
			}
			
			else
			{
				System.out.println(" Registration Failed for " + r + " record");
			}
			
			driver.findElement(By.linkText("REGISTER")).click();
						
		}	
			
	}
		
}


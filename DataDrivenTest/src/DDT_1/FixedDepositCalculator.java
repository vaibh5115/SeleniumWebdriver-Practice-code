package DDT_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator 
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Study\\eclipse_workspace\\Selenium Jar files\\Selenium browser drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");

		driver.manage().window().maximize();
		
		String path="E:\\Study\\eclipse_workspace\\Selenium input files\\caldata.xlsx";
		
		XLUtils.setExcelFile(path,"Sheet1");  //read data from excel
		
		int rowCount=XLUtils.getRowCount(path,"Sheet1"); //count rows
		
		for(int r=1;r<=rowCount;r++)  //read each row 
		{
			int principal=Integer.parseInt(XLUtils.getCellData(path,"Sheet1",r,0));
			int roi=Integer.parseInt(XLUtils.getCellData(path,"Sheet1",r,1));
			int period=Integer.parseInt(XLUtils.getCellData(path,"Sheet1",r,2));
			String freq=XLUtils.getCellData(path,"Sheet1",r,3);
			double exp_mat_value=Double.parseDouble(XLUtils.getCellData(path,"Sheet1",r,4));
			
			driver.findElement(By.xpath("//*[@id=\"principal\"]")).sendKeys(String.valueOf(principal));
			driver.findElement(By.xpath("//*[@id=\"interest\"]")).sendKeys(String.valueOf(roi));
			driver.findElement(By.xpath("//*[@id=\"tenure\"]")).sendKeys(String.valueOf(period));
			
			Select period_dd= new Select(driver.findElement(By.xpath("//*[@id=\"tenurePeriod\"]")));
			period_dd.selectByVisibleText("year(s)");
			
			Select freq_dd= new Select(driver.findElement(By.xpath("//*[@id=\"frequency\"]")));
			freq_dd.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			
			String Act_mat_value=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
			
			if(exp_mat_value==Double.parseDouble(Act_mat_value))
			{
				System.out.println("Test passed");
			}
			else
			{
				System.out.println("Test failed");
			}
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img")).click();
		}

	}

}

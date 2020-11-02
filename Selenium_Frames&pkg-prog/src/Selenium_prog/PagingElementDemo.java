package Selenium_prog;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PagingElementDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://eclipse_workspace/Browser_drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().window().maximize();
		
		//identify paging element
		
		WebElement paging_ele=driver.findElement(By.xpath("//*[@id=\"myPager\"]"));
		List<WebElement> sub_links=paging_ele.findElements(By.tagName("a"));
		
		//identify number of sublinks inside paging element
		System.out.println("number of sublinks:"+sub_links.size());
		
		if(sub_links.size()>0)
		{
			System.out.println("Sublinks are present in paging element");
			
			for(int i=1;i<sub_links.size()-1;i++)
			{
				WebElement link=driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
				link.click();  // click on 1st paging element
				
				Thread.sleep(3000);
				
				int rows=driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr")).size();
				
				
				for(int r=1;r<=rows;r++)//reading the data from table
				{
					System.out.println("Table Data:");
					String col_1_data=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[1]")).getText();
					String col_2_data=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[2]")).getText();
					String col_3_data=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[3]")).getText();
					String col_4_data=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[4]")).getText();
					String col_5_data=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[5]")).getText();
					
					System.out.println(col_1_data+"	"+col_2_data+"	"+col_3_data+"	"+col_4_data+"	"+col_5_data+"	");
				}
			}	
		}
		
		else
		{
			System.out.println("Sublinks are not present in paging element");
		}
		
	}

}

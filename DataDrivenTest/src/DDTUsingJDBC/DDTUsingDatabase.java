package DDTUsingJDBC;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DDTUsingDatabase {

	public static void main(String[] args) throws SQLException, InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Study\\eclipse_workspace\\Selenium Jar files\\Selenium browser drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); /// opens the browser
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.manage().window().maximize();
		
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","c##scott","tiger");
	
	//step2
			Statement stmt=con.createStatement();
			
			//Step3 & step4 : Creation and execution of query
			String s="select * From users";
			ResultSet rs=stmt.executeQuery(s);
			
			while(rs.next())
			{
				String uname=rs.getString("USRNAME");
				String pwd=rs.getString("PASSWD");
				
				driver.findElement(By.name("userName")).sendKeys(uname);
				driver.findElement(By.name("password")).sendKeys(pwd);
				driver.findElement(By.name("login")).click();
				
				Thread.sleep(5000);
				
				if(driver.getTitle().equals("Find a Flight: Mercury Tours:"))
				{
					System.out.println("passed");
				}
				else
				{
					System.out.println("failed");
				}
				
				driver.findElement(By.linkText("Home")).click();
				
			}
					
			//step5
			rs.close();
			con.close();


	
	}

}

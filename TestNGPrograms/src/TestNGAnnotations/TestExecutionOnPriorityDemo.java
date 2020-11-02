package TestNGAnnotations;

import org.testng.annotations.Test;

public class TestExecutionOnPriorityDemo 
{
	@Test(priority=10)
	void login()
	{
		//webdriver code for open URL
			System.out.println(" This is Login");
	}
	
	@Test(priority=15)
	void logout()
	{
		//webdriver code for open URL
		System.out.println(" This is Logout");
	}
	
	@Test(priority=5)
	void openURL()
	{
		//webdriver code for open URL
		System.out.println(" This is open URL");
	}

}

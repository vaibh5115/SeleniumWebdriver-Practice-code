package TestNGAnnotations;

import org.testng.annotations.*;

public class TestNGAnnotationsDemo2 
{
	@BeforeClass
	void login()
	{
	System.out.println("this is login");	
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("this is logout");	
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search");	
	}
	
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("this is adv search");	
	}
	
	@Test(priority=3)
	void recharge()
	{
		System.out.println("this is recharge");	
	}

}

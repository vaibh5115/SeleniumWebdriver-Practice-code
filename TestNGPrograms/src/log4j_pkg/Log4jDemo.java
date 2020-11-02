package log4j_pkg;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jDemo 
{
	static Logger log;
	@Test(priority=1)
	public void setup()
	{
		log=Logger.getLogger("Log4jDemo"); //provide test case name/class name as a parameter
		PropertyConfigurator.configure("log4j.properties");
		log.info("setup method started");
		log.info("setup method is in progress");
		System.out.println("this is setup method");
		log.info("setup method Completed");
		
	
	}
	
	@Test(priority=2)
	public void login()
	{
		log.info("login method started");
		log.info("login method is in progress");
		System.out.println("this is login method");
		log.info("login successful");
		log.info("login method completed");	
	}
	
	@Test(priority=3)
	public void logout()
	{
		log.info("logout method started");
		log.info("logout method is in progress");
		System.out.println("this is logout method");
		log.info("logout successful");
		log.info("logout method completed");
	}

}

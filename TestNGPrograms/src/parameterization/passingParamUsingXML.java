package parameterization;

import org.testng.Assert;
import org.testng.annotations.*;

public class passingParamUsingXML 
{
	@Parameters({"x","y"})
	@Test
	void test1(String a,String b)
	{
		System.out.println(a+b);
	}
	
	@Parameters("z")
	@Test
	void test2(String c)
	{
		System.out.println(c);
	}
	
	@Test
	void test3()
	{
		System.out.println("closed");
		Assert.assertTrue(true);
	}
	
}

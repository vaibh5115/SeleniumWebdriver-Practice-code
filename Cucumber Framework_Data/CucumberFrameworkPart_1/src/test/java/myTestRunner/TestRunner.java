package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="Feature file"
		features="E:\\Study\\eclipse_workspace\\Cucumber Framework_Data\\CucumberFrameworkPart_1\\Feature file\\Hooks.feature", 
		glue="stepDefinitions", 
		dryRun=false,
		monochrome=true,
		format= {"pretty","html: test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		strict=false
		//tags= {"@SanityTest"} //execute only sanity test steps
		//tags= {"@SanityTest,@RegressionTest"} //execute both sanity test OR regression test
		//tags= {"@SanityTest","@End2EndTest"} //execute both sanity AND End2End test
		//tags= {"~@SanityTest"} // ignore sanity test cases and execute rest of the test cases
		
		
		)
public class TestRunner 
{

}

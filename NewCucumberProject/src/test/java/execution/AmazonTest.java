package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution\\Login.feature"},
		
		//to run only fail test scenario 
	//	features = {"@target/failedrun.txt"},
		
		glue = {"execution"},
	//	plugin = {"pretty", "rerun:target/failedrun.txt"}
		
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)

public class AmazonTest extends AbstractTestNGCucumberTests {
	
	

}

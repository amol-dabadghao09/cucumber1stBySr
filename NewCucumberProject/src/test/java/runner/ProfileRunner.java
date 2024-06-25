package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationTest\\ProfilePicture.feature"},
		glue = {"steps"},
		plugin = {"pretty"},
		tags = "@fuctional or @regration"
	
	//	OR for to run both scenario
	//	AND is to run the scenario which has 2 tags 
	//	NOT is for not running that particular scenario	
	//	tag = "@fuctional and @regration"
	//	tag = "not @fuctional"	
		
		)



public class ProfileRunner extends AbstractTestNGCucumberTests {
	
	
	

}

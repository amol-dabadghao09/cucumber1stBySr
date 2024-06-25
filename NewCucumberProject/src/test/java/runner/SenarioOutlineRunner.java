package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationTest\\SenarioOuline.feature"},
		glue = {"steps"},
		plugin = {"pretty"}
		
		
		)


public class SenarioOutlineRunner extends AbstractTestNGCucumberTests {
	
	
	

}

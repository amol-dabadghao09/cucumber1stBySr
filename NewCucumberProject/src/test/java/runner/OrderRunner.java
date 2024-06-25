package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationTest\\Orders.feature"},
		glue = {"steps"},
		plugin = {"pretty"}
		
		
		)

public class OrderRunner extends AbstractTestNGCucumberTests{

	
	
}

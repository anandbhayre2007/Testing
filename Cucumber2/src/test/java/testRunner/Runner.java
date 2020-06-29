package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(		
		 features = "src/test/resources/Features",
	        glue = {"stepDefinition"}	
		)
//Anand

public class Runner {

}

package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appfeature"},
		glue = {"stepdefinations", "parallel"},
		tags = "@smoke or @regression",
		plugin = {"pretty",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				 "rerun:target/failedrerun.txt"},
		monochrome = true
		
		)

public class MyTestRunner {

}

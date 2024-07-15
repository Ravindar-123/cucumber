package demorunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		    features="C:\\Users\\RAVINDAR\\eclipse-workspace\\selenium.Cucumber_NopCommerce\\src\\test\\featureFile\\features",
		    glue = "stepDefinitions",
		    plugin = "html:target/reports/testresult.html",
		    tags = "@PositiveTesting"

		)

public class TestRunner {

}

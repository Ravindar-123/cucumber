package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/featureFile/LoginBackgroundFeature.feature",
                 glue = "stepDefinitions",
                 plugin = "html:target/testReports.html",
                // tags = "@Positive"
                 tags = "@Negative"
		)
public class Runner {

}

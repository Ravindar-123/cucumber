package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/featureFile/features",
                 glue = "stepDefinitions",
                 plugin ="html:target/reports/testResult.html"
//                 tags = "positiveTesting"
		)
public class Runner {
}

package runnerTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Admin\\eclipse-workspace\\BDDProj\\src\\main\\java\\features\\Login.feature",
		glue= {"stepDefination"},
		format= {"pretty", "html:test-output"}
		)

public class TestRunner {

}

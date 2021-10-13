package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinition"},
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JsonReports/report.json",
		"html:target/HtmlReports/report.html"}
)

public class TestRunnner {

}

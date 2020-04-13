package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber", "summary","json:target/cucumber/report.json" },
		strict = true, 
		monochrome = true, 
		features = { "classpath:features" },
		glue = {"classpath:stepdefs","classpath:parallel"} //glue path from Alpha project
 )


public class RunCucumberTest {
}
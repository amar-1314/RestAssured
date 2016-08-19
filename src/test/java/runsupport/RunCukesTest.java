package runsupport;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "classpath:features",
	    format = { "pretty",
		       "html:target/site/cucumber-pretty",
		        "json:target/cucumber.json"},
		//plugin = {"pretty", "html:target/cucumber-html1-reports", "json:target/cucumber.json"},
		glue = { "classpath:steps", "classpath:runsupport" },
		tags = {"@amar"}
		)
public class RunCukesTest{
	
}
package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "FeatureFiles",
		glue = "Steps",
		plugin = {"html:target/cucumber-html-report"},
		monochrome = true
		
		
		
)

public class TestRunner {



}
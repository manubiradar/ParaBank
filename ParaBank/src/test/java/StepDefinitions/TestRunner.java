package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/feature/",
glue={"StepDefinitions"},
monochrome = true,
plugin={"pretty","html:target/html-reports.html","html:target/cucumber-reports.html"} )

public class TestRunner {

}

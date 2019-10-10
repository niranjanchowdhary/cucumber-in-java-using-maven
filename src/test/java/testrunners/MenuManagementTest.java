package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/cucumber/java/maven/feature/MenuManagement.feature"},
		glue = {"stepdefinitions"},
		plugin = {"pretty"}
		)
public class MenuManagementTest {

}

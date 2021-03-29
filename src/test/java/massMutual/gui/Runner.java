package massMutual.gui;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "html:target\\cucumber-html-report","json:target/cucumber-reports/Cucumber.json"},
		features={"src/test/resources/featuresFiles/HomePage.feature"},
		monochrome = true
		)
public class Runner extends AbstractTestNGCucumberTests{

}

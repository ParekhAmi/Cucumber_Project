package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"D:\\QA\\Selenium_WorkSpace\\CucumberProjectBatch66\\src\\test\\java\\features"},//the path of the feature files
		glue={"stepDefinations"},//the path of step Defination package Name
		plugin = {"pretty", 
//				  "html:target/cucumber-reports/cucumber.html",
				  "json:target/cucumber-reports/cucumber.json",
    	          "junit:target/cucumber-reports/cucumber.xml"},
		monochrome = true,//Display the console output in proper readable format
		dryRun = false //To check (all steps) mapping between Stepdefinition file and feature file, if it's not there shows you in console by dryRun=true,
		               //if everything is good, then make it dryRun = false, then only it executes all tests
		)

public class ScotiaTest {
	
}

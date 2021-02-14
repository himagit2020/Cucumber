package testsuites;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", 
glue= {"step_definitions"},
monochrome=true,
plugin = {"pretty", "html:HTML-Report\\Result.html", "junit:HTML-Report\\Result.xml", "json:HTML-Report\\Result.json"},
tags="@RegressionTest"
)

public class TestRunner {


}


	


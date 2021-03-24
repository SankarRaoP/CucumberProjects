package com.dbs.runnerClass;

import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "pretty","html:target/cucumber-reports" }, 
				features = {"src/test/resources/features"}, 
				tags = "@CompareCards",
				glue = { "com.dbs.stepDefinitions" })

public class RunnerClassTest {	
	
}
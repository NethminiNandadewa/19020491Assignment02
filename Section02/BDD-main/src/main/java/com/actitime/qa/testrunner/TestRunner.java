package com.actitime.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "/Users/nethmininandadewa/Documents/UCSC/4 Year/IS4102 Advanced SQA/Assignment 02/BDD-main/src/main/java/com/actitime/qa/feature/CreateUser.feature" , "/Users/nethmininandadewa/Documents/UCSC/4 Year/IS4102 Advanced SQA/Assignment 02/BDD-main/src/main/java/com/actitime/qa/feature/Loging.feature"}
		,glue={"com/actitime/qa/stepdefinitions"}
		,monochrome = true,
				strict=true,
				dryRun=false
				
		)




public class TestRunner {
	
	
	

}

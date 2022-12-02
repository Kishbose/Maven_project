package com.Cucumber_TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Cucumber_FeatureFile\\Login.Feature",glue = "com\\Cucumber_StepDef\\Step_Definition.java")


public class Test_Runner {
	

	

}
	
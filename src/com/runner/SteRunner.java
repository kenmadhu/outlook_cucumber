package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "./Feature/first.feature",
				dryRun = false,
				monochrome = true,
				tags="@tag",
				glue= {"com.test"})
@RunWith(Cucumber.class)
public class SteRunner {

}

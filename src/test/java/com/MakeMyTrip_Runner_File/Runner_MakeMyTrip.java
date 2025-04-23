package com.MakeMyTrip_Runner_File;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/MakeMyTrip.feature",
		glue = {"com.MakeMyTrip_StepDefinition","com.MakeMyTrip_HooksFile"},
		dryRun = false,
		plugin = {"pretty","html:target/reports/makemytrip_reports.html"},
		publish = true,
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		
		
		
		)
public class Runner_MakeMyTrip {


}

package com.aiite.runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Dell\\eclipse-workspace\\WebAutomationBDD\\src\\test\\resources\\Featues",
				glue={"com.aiite.pageexecution"},
				monochrome=true,
				dryRun = false,
				tags= "@Smoke",
				plugin= {"html:Reports/report.html", "json:Reports/report2.json", "rerun:Failed/rerun.txt"})
public class TestRunner {
	

}

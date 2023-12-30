package com.aiite.runnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@Failed/rerun.txt",
				glue={"com.aiite.pageexecution"},
				monochrome=true,
				dryRun = false,
				plugin= {"html:Reports/Rerunreport.html", "json:Reports/Rerunreport2.json", "rerun:Failed/rerun.txt"})
public class Rerunner {

}

package com.tryCloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                // "pretty", it allows us to see which steps will be executed
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
US005_CalendarModuleFunctionality_Sevinj
        features = "src/test/resources/Features/Login.feature",
        glue = "com/tryCloud/step_definitions",
        dryRun = true,
        tags = "@B34G11-158",
        // monochrome = true,
        publish = true
)

public class CukesRunner {
}

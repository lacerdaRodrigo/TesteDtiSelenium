package com.testedti;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"com.testedti.steps"},
    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
)
public class AppTest {
}
package com.nop.feature;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@tag2",
        format = {"pretty", "html:target/cucumber-reports"})
public class RunTest {
}

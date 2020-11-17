package com.flow.gameFlow;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false,
        features = "src\\test\\resource",
         plugin = {"pretty", "json:target\\cucumber.json"}
)


public class RunnerTest {
}

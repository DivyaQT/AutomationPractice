package com.Test.DivyaLNarayan;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resource/features/", glue = {"com.Test.steps"})

//To run INDIVIDUAL feature files, Uncomment the one that is required to be run and comment the other CucumberOptions lines of code

//@CucumberOptions(features = "src/test/resource/features/PlaceOrder.feature", glue = {"com.Test.steps"})
//@CucumberOptions(features = "src/test/resource/features/UpdateInformation.feature", glue = {"com.Test.steps"})

public class TestRunner {
}

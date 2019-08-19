package com.project.qa.ui.runners;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/

@RunWith(CustomCucumberRunner.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.project.qa.ui.stepdefs"
        //tags = {"@gui"}
)
public class TestRunner {
}

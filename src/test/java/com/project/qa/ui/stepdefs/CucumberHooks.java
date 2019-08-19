package com.project.qa.ui.stepdefs;

import com.project.qa.ui.runners.TestContext;
import com.project.qa.ui.webdriver.WebDriverManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/
public class CucumberHooks {
    TestContext testContext;
    WebDriverManager webDriverManager;

    public CucumberHooks(TestContext context) {
        testContext = context;
        webDriverManager = context.getWebDriverManager();
    }

    /**
     * This method is executed before every scenario
     */
    @Before("not @nongui")
    public void BeforeScenario() {
        webDriverManager.getDriver();
    }

    /**
     * This method is executed after every scenario
     *
     * @param scenario
     * @throws IOException
     */
    @After("not @nongui")
    public void AfterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            webDriverManager.captureScreenshot(scenario.getName().toLowerCase().replaceAll(" ", ""));
        }
        webDriverManager.closeDriver();
    }
}

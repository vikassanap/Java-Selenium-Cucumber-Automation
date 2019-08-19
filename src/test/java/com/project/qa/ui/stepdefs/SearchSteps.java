package com.project.qa.ui.stepdefs;

import com.project.qa.ui.helpers.AssertionHelper;
import com.project.qa.ui.pageobjects.GoogleSearchPage;
import com.project.qa.ui.pageobjects.SearchResultPage;
import com.project.qa.ui.runners.TestContext;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/
public class SearchSteps implements AssertionHelper {
    TestContext testContext;
    EventFiringWebDriver driver;
    GoogleSearchPage googleSearchPage;
    SearchResultPage searchResultPage;

    public SearchSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        googleSearchPage = testContext.getPageObjectManager().getGoogleSearchPage(driver);
        searchResultPage = testContext.getPageObjectManager().getSearchResultPage(driver);
    }

    @Given("Goto {string}")
    public void goto_url(String url) {
        driver.get(url);
    }

    @Given("Search {string}")
    public void search(String keyword) {
        googleSearchPage.setQueryInput(keyword);
        googleSearchPage.clickGoogleSearchButton();
    }

    @Given("User is on Google search results page")
    public void user_is_on_Google_search_results_page() {
        assertTrue(searchResultPage.isSearchResultOptionsTabLoaded(), "Search results page is not loaded");
    }

    @Given("User is not on Google search results page")
    public void user_is_not_on_Google_search_results_page() {
        assertTrue(searchResultPage.isSearchResultOptionsTabLoaded(), "Search results page is not loaded");
    }
}

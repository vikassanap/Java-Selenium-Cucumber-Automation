package com.project.qa.ui.pageobjects;

import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/
public class PageObjectManager {
    private GoogleSearchPage googleSearchPage;
    private SearchResultPage searchResultPage;

    /**
     * Method to get google search page instance
     *
     * @param driver
     * @return google search page instance
     */
    public GoogleSearchPage getGoogleSearchPage(EventFiringWebDriver driver) {
        return (googleSearchPage == null) ? googleSearchPage = new GoogleSearchPage(driver) : googleSearchPage;
    }

    /**
     * Methdd to get google results page instance
     *
     * @param driver
     * @return google results page instance
     */
    public SearchResultPage getSearchResultPage(EventFiringWebDriver driver) {
        return (searchResultPage == null) ? searchResultPage = new SearchResultPage(driver) : searchResultPage;
    }
}

package com.project.qa.ui.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/
public class SearchResultPage extends BasePage {

    @FindBy(how = How.ID_OR_NAME, using = "duckbar")
    private WebElement searchResultOptionsTab;

    public SearchResultPage(EventFiringWebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /**
     * Method to check if search result page is loaded or not
     * @return true if loaded false otherwise
     */
    public boolean isSearchResultOptionsTabLoaded() {
        return searchResultOptionsTab.isDisplayed();
    }
}

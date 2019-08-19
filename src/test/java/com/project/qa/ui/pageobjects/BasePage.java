package com.project.qa.ui.pageobjects;


import org.openqa.selenium.WebElement;

import com.project.qa.ui.helpers.ActionHelper;
import com.project.qa.ui.helpers.AlertHelper;
import com.project.qa.ui.helpers.AssertionHelper;
import com.project.qa.ui.helpers.DropDownHelper;
import com.project.qa.ui.helpers.FrameHelper;
import com.project.qa.ui.helpers.JQueryHelper;
import com.project.qa.ui.helpers.JavaScriptHelper;
import com.project.qa.ui.helpers.VerificationHelper;
import com.project.qa.ui.helpers.WaitHelper;
import com.project.qa.ui.helpers.WindowHelper;
import com.project.qa.ui.helpers.*;

/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/
public class BasePage implements ActionHelper, AlertHelper, AssertionHelper, DropDownHelper, FrameHelper, JavaScriptHelper, VerificationHelper, WaitHelper, WindowHelper, JQueryHelper {
    /**
     * Method to clear input box and set value
     *
     * @param webElement
     * @param value
     */
    void clearAndSet(WebElement webElement, String value) {
        webElement.clear();
        webElement.sendKeys(value);
    }
}

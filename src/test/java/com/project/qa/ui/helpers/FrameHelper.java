package com.project.qa.ui.helpers;
/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project.qa.ui.helpers.FrameHelper;

import static com.project.qa.ui.webdriver.WebDriverManager.driver;

public interface FrameHelper {

    Logger LOGGER = LoggerFactory.getLogger(FrameHelper.class);


    /**
     * this method will switchToFrame based on frame index
     *
     * @param frameIndex
     */
    default void switchToFrame(int frameIndex) {
        driver.switchTo().frame(frameIndex);
        LOGGER.info("switched to :" + frameIndex + " frame");
    }

    /**
     * this method will switchToFrame based on frame name
     *
     * @param frameName
     */
    default void switchToFrame(String frameName) {
        driver.switchTo().frame(frameName);
        LOGGER.info("switched to :" + frameName + " frame");
    }

    /**
     * this method will switchToFrame based on frame WebElement
     *
     * @param element
     */
    default void switchToFrame(WebElement element) {
        driver.switchTo().frame(element);
        LOGGER.info("switched to frame " + element.toString());
    }
}

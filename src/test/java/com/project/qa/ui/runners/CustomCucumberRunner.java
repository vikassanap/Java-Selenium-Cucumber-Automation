package com.project.qa.ui.runners;

import cucumber.api.junit.Cucumber;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

import com.project.qa.ui.listeners.JUnitListeners;

/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/

/**
 * This class overrides default test listener with custom one
 */
public class CustomCucumberRunner extends Cucumber {


    public CustomCucumberRunner(Class clazz) throws InitializationError {
        super(clazz);
    }

    @Override
    public void run(RunNotifier runNotifier) {
        runNotifier.addListener(new JUnitListeners());
        super.run(runNotifier);
    }
}

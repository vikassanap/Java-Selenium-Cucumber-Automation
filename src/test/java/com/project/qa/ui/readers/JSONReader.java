package com.project.qa.ui.readers;

import gherkin.deps.com.google.gson.JsonObject;
import gherkin.deps.com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project.qa.ui.readers.ConfigFileReader;
import com.project.qa.ui.readers.JSONReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/
public class JSONReader {
    static final Logger LOGGER = LoggerFactory.getLogger(JSONReader.class);
    private String jsonFilePath;

    public JSONReader() {
        String jsonFileName = new ConfigFileReader().getDefaultJSONFilePath();
        LOGGER.info("reading json file from default path: {}", jsonFileName);
        jsonFilePath = this.getClass().getClassLoader().getResource(jsonFileName).getPath();
    }

    public JSONReader(String jsonFileName) {
        LOGGER.info("reading json file from given path: {}", jsonFileName);
        jsonFilePath = this.getClass().getClassLoader().getResource(jsonFileName).getPath();
    }

    /**
     * Method to read test data value from JSON test data file
     *
     * @param testcase
     * @param key
     * @return value
     */
    public String readValueByKey(String testcase, String key) {
        JsonParser jsonParser = new JsonParser();
        String value = null;
        try (FileReader reader = new FileReader(jsonFilePath)) {
            JsonObject jsonObject = (JsonObject) jsonParser.parse(reader);
            JsonObject testCase = (JsonObject) jsonObject.get(testcase);
            value = testCase.get(key).getAsString();

        } catch (IOException e) {
            LOGGER.error("error while reading json file {}", e.getMessage());
        }
        return value;
    }
}

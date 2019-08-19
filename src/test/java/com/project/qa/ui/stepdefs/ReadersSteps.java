package com.project.qa.ui.stepdefs;

import com.project.qa.ui.readers.ExcelReader;
import com.project.qa.ui.readers.JSONReader;
import com.project.qa.ui.readers.YAMLReader;
import com.project.qa.ui.runners.TestContext;
import cucumber.api.java.en.Given;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

/**
 * @author : Vikas S.
 * @since : 07-06-2019, Fri
 **/
public class ReadersSteps {
    private TestContext testContext;
    private Map<String, Object> keyObjectMap;

    public ReadersSteps(TestContext context) {
        testContext = context;
        this.keyObjectMap = testContext.getKeyObjectMap();
    }

    @Given("Verify YAML file reader function for default file")
    public void verify_YAML_file_reader_function_for_default_file() {
        YAMLReader yamlReader = new YAMLReader();
        Map<String, Object> yamlData = yamlReader.readYamlIntoMap();
        List<Map<String, Object>> validUser = (List<Map<String, Object>>) yamlData.get("valid_user");
        Assert.assertEquals(yamlData.get("application_url"), "http://www.inside.co.in");
        Assert.assertEquals(validUser.get(0).get("username"), "test");
        Assert.assertEquals(validUser.get(1).get("password"), "password");
    }

    @Given("Verify YAML file reader function for specific file")
    public void verify_YAML_file_reader_function_for_specific_file() {
        YAMLReader yamlReader = new YAMLReader("testdata.yml");
        Map<String, Object> yamlData = yamlReader.readYamlIntoMap();
        List<Map<String, Object>> inValidUser = (List<Map<String, Object>>) yamlData.get("invalid_user");
        Assert.assertEquals(yamlData.get("application_url"), "http://www.outside.co.in");
        Assert.assertEquals(inValidUser.get(0).get("username"), "test_invalid");
        Assert.assertEquals(inValidUser.get(1).get("password"), "password_invalid");
    }

    @Given("Verify JSON file reader function for default file")
    public void verify_JSON_file_reader_function_for_default_file() {
        JSONReader jsonReader = new JSONReader();
        Assert.assertEquals(jsonReader.readValueByKey("testcase_1", "username"), "t1_user");
    }

    @Given("Verify JSON file reader function for specific file")
    public void verify_JSON_file_reader_function_for_specific_file() {
        JSONReader jsonReader = new JSONReader("testdata.json");
        Assert.assertEquals(jsonReader.readValueByKey("testcase_1", "username"), "t1_user_outside");
    }

    @Given("Verify EXCEL file reader function for default file")
    public void verify_EXCEL_file_reader_function_for_default_file() {
        Assert.assertEquals(new ExcelReader().getExcelFileData("Sheet1")[0][0], "testuser1");
    }

    @Given("Verify EXCEL file reader function for specific file")
    public void verify_EXCEL_file_reader_function_for_specific_file() {
        Assert.assertEquals(new ExcelReader("testdata.xlsx").getExcelFileData("Sheet1")[0][1], "password1_out");
    }
}

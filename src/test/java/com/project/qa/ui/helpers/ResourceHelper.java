package com.project.qa.ui.helpers;

/**
 * @author : Vikas S.
 * @since : 05-06-2019, Wed
 **/
public class ResourceHelper {
    /**
     * This method generate resource path for given file
     *
     * @param path
     * @return absolute path
     */
    public static String getResourcePath(String path) {
        String basePath = System.getProperty("user.dir");
        return basePath + "/" + path;
    }
}

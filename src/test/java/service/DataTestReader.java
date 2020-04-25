package service;

import java.util.ResourceBundle;

/**
 * Created by user on 21.03.2020.
 */
public class DataTestReader {

    public static ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("environment"));

    public static String getTestData(String key){
        return resourceBundle.getString(key);
    }
}

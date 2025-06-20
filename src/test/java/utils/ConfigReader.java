package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties prop;
    public static String getProperty(String key) throws IOException {
        try {

            if (prop == null) {
                prop = new Properties();
                FileInputStream fis = new FileInputStream("config.properties");
                prop.load(fis);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
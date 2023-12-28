package pages;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class LoadProperties {
    public static Properties properties;
    static String pageURL;

    public static void loadProperties() {
        try {
            properties = new Properties();
            properties.load(Files.newInputStream(Paths.get("./src/test/resources/config.properties")));
        } catch (IOException ex) {
            System.out.println("Failed to load config properties. ABORT!!");
        }
    }
    public static String getURL() {
        loadProperties();
        pageURL = properties.getProperty("BASE_URL");
        return pageURL;
    }
}

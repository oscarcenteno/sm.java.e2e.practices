package sm.example.navigation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    public static Properties load(){
        String userDir = getBaseDir();
        String environment = determineEnvironment();

        return getProperties(userDir, environment);
    }

    private static Properties getProperties(String userDir, String environment) {
        String propertyFilePath = getPropertiesPath(userDir, environment);

        return loadPropertiesFile(propertyFilePath);
    }

    private static String getBaseDir() {
        return System.getProperty("user.dir");
    }

    private static String determineEnvironment() {
        String receivedEnvironment = System.getProperty("environment");
        String environment;

        if (receivedEnvironment == null) {
            environment = "dev";
        }
        else{
            environment = receivedEnvironment;
        }

        return environment;
    }

    private static String getPropertiesPath(String userDir, String environment) {
        String resources = "\\src\\test\\resources\\";
        String extension = ".properties";

        return userDir + resources + environment + extension;
    }

    private static Properties loadPropertiesFile(String path) {
        Properties properties = new Properties();

        try {
            System.out.println("Loading Configuration Properties...");
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            System.out.println("ERROR: Configuration properties file cannot be found");
        }

        return properties;
    }
}
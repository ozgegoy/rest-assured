package config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private final Properties properties;
    private static ConfigReader instance;

    private ConfigReader(Properties properties) {
        this.properties = properties;
    }

    private static void loadProperties() {
        if (instance != null) return;

        String fileName = System.getProperty("config.file", "config-dev.properties");

        Properties props = new Properties();
        try (InputStream is = ConfigReader.class
                .getClassLoader()
                .getResourceAsStream(fileName)) {

            if (is == null) {
                throw new RuntimeException("Config file not found: " + fileName);
            }

            props.load(is);
            instance = new ConfigReader(props);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load config", e);
        }
    }

    public static String getProperty(String key) {
        String systemProperty = System.getProperty(key);
        if (systemProperty != null) {
            return systemProperty;
        }

        loadProperties();

        return instance.properties.getProperty(key);
    }
}
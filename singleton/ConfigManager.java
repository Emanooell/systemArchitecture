package singleton;

import java.io.*;
import java.util.Properties;

public class ConfigManager {

    private static ConfigManager instance;
    private String configFile;

  
    private ConfigManager() {
        this.configFile = "config.properties"; 
    }

   
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

 
    public String getProperty(String key) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(configFile)) {
            properties.load(fis);
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

  
    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }
}

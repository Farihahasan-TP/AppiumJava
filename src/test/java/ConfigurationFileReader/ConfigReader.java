package ConfigurationFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;

    public ConfigReader(){
        BufferedReader reader;
        String propertyFilePath = "configuration/Config.properties";
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found in " + propertyFilePath);
        }
    }

    public String getPlatformName(){
        String platformName = properties.getProperty("platformName");
        if (platformName != null) return platformName;
        else throw new RuntimeException("platformName not configured in Config File");
    }

    public String getDeviceName(){
        String deviceName = properties.getProperty("deviceName");
        if (deviceName != null) return deviceName;
        else throw new RuntimeException("deviceName not configured in Config File");
    }

    public String getAutomationName(){
        String automationName = properties.getProperty("automationName");
        if (automationName != null) return automationName;
        else throw new RuntimeException("automationName not configured in Config File");
    }

    public String getPlatformVersion(){
        String platformVersion = properties.getProperty("platformVersion");
        if (platformVersion != null) return platformVersion;
        else throw new RuntimeException("platformVersion not configured in Config File");
    }

    public String getApkPath(){
        String apkPath = properties.getProperty("apkPath");
        if (apkPath != null) return apkPath;
        else throw new RuntimeException("apkPath not configured in Config File");
    }

    public String appiumServerEndpointURL(){
        String appiumServerEndpointURL = properties.getProperty("appiumServerEndpointURL");
        if (appiumServerEndpointURL != null) return appiumServerEndpointURL;
        else throw new RuntimeException("AppiumServerEndpointURL not configured in Config File");
    }
}

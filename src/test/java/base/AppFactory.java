package base;

import ConfigurationFileReader.ConfigReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class AppFactory {

    public static AppiumDriver driver;
    public static DesiredCapabilities caps;
    public static ConfigReader configReader;

    public static void initializer(){
        try{
            caps = new DesiredCapabilities();
            configReader = new ConfigReader();
            caps.setCapability("deviceName", configReader.getDeviceName());
            caps.setCapability("platformName", configReader.getPlatformName());
            caps.setCapability("platformVersion", configReader.getPlatformVersion());
            caps.setCapability("automationName", configReader.getAutomationName());
            caps.setCapability("app",System.getProperty("user.dir") +configReader.getApkPath());
            driver = new AndroidDriver(new URL(configReader.appiumServerEndpointURL()),caps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        AppDriver.setDriver(driver);
        System.out.print("Android Driver is set");
    }

    public static void quitDriver() {
        if (null != driver) {
            driver.quit();
        }
    }
}

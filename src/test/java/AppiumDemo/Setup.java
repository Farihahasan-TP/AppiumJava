package AppiumDemo;

import java.net.URL;
import ConfigurationFileReader.ConfigReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Setup {

    AppiumDriver driver;
    ConfigReader configReader;

    public Setup(){
        configReader = new ConfigReader();
        try{
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", configReader.getDeviceName());
            caps.setCapability("platformName", configReader.getPlatformName());
            caps.setCapability("platformVersion", configReader.getPlatformVersion());
            caps.setCapability("automationName", configReader.getAutomationName());
            caps.setCapability("app",System.getProperty("user.dir") +configReader.getApkPath());
            driver = new AndroidDriver(new URL(configReader.appiumServerEndpointURL()), caps);
            System.out.print("Opening Appium Server");
        } catch (Exception e) {
            System.out.print("Cause is:" +e.getCause());
            e.printStackTrace();
        }
    }
}

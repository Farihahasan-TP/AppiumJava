package AppiumDemo;

import java.net.URL;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Setup {

    AppiumDriver driver;

    @BeforeTest
    public void setup(){
        try{
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Pixel-5");
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "10");
            caps.setCapability("automationName", "uiAutomator2");
            caps.setCapability("appPackage", "com.android.contacts");
            caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver(url, caps);

        } catch (Exception e) {
            System.out.print("Cause is:" +e.getCause());
            e.printStackTrace();
        }
    }

    @Test
    public void sampleTest(){
        System.out.print("Testcase passed!!!");
    }

    @AfterTest
    public void teardown(){
        try{
            driver.close();
            driver.quit();
        }catch (Exception exp){
            exp.printStackTrace();
        }
    }
}

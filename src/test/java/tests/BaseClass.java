package tests;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    AndroidDriver<AndroidElement> driver = null;

    @BeforeTest
    public void setup(){

        File appDir = new File("src\\test\\resources\\apps");
        File app = new File(appDir, "amelia.apk");

        try {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "xiaomi-mi_a3");
        capabilities.setCapability(MobileCapabilityType.UDID, "622115f31e16");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);


            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch(Exception exp)
        {
            System.out.println("Case is:" + exp.getCause());
            System.out.println("Message is:" + exp.getMessage());
            exp.printStackTrace();
        }

    }

    @AfterTest
    public void teardown(){
        //driver.close();
        driver.quit();
    }

}

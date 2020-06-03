package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class LoginTest extends BaseClass {

    //LoginPage loginPage = new LoginPage();

    @Test
    public void FirstTest(){

        /*loginPage.fieldUserName.sendKeys("forAmeliaAutotests");
        loginPage.fieldPassword.sendKeys("Password1!");
        loginPage.buttonLogin.click();
        loginPage.buttonStart.click();*/

        driver.findElementByAccessibilityId("AuthView-default-login-username-input-text").sendKeys("forAmeliaAutotests");
        driver.findElementByAccessibilityId("AuthView-default-login-password-input-text").sendKeys("Password1!");
        driver.findElementByAccessibilityId("AuthView-amelia-login-text").click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Case is:" + e.getCause());
            System.out.println("Message is:" + e.getMessage());
            e.printStackTrace();
        }
        for (int i=0; i<2; i++) {
            swipeRight();
        }
        driver.findElementByAccessibilityId("OnboardingView-start-button").click();
        //loginPage.buttonStart.click();
        Assert.assertTrue(driver.findElementByXPath("//*[@text='TO DO']").isDisplayed());

    }

    public void scroll(int startx, int starty, int endx, int endy) {

        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(point(startx, starty))
                .waitAction(WaitOptions.waitOptions(ofSeconds(2)))
                .moveTo(point(endx, endy))
                .release()
                .perform();

    }

    public void swipeRight() {

        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        scroll(startx, starty, endx, starty);

    }
}

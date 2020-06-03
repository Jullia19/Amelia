package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import tests.BaseClass;

public class LoginPage {

    AndroidDriver<AndroidElement> driver;

    public AndroidElement fieldUserName = driver.findElementByAccessibilityId("AuthView-default-login-username-input-text");
    public AndroidElement fieldPassword = driver.findElementByAccessibilityId("AuthView-default-login-password-input-text");
    public AndroidElement buttonLogin = driver.findElementByAccessibilityId("AuthView-amelia-login-text");
    public AndroidElement buttonStart = driver.findElementByAccessibilityId("OnboardingView-start-button");


}

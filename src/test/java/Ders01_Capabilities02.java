import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Ders01_Capabilities02 {
    public void appiumDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.wt.apkinfo");
        desiredCapabilities.setCapability("appActivity", "com.wt.apkinfo.activities.StartActivity");

        AppiumDriver appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);

    }
    public void androidDriver() throws MalformedURLException {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setAutomationName("UiAutomator2");
        uiAutomator2Options.setAppPackage("com.wt.apkinfo");
        uiAutomator2Options.setAppActivity("com.wt.apkinfo.activities.StartActivity");

        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), uiAutomator2Options);

    }

    public void iosDriver() throws MalformedURLException {
        XCUITestOptions xcuiTestOptions = new XCUITestOptions();
        xcuiTestOptions.setPlatformName("iOS");
        xcuiTestOptions.setAutomationName("XCUITest");
        xcuiTestOptions.setBundleId("com.wt.apkinfo");

        IOSDriver iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723"), xcuiTestOptions);

    }
}

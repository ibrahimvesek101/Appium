import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Ders01_Capabilities01 {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        AppiumDriver appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);

    }

    public void AndroidDriver() throws MalformedURLException {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setAutomationName("UiAutomator2");
        AppiumDriver appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723"), uiAutomator2Options);
    }

    public void AppiumDriver() throws MalformedURLException {
        // 3 farklı capabilities girebileceğimiz yöntem var;

        //1.
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.wt.apkinfo");
        desiredCapabilities.setCapability("appActivity", "com.wt.apkinfo.activities.StartActivity");
        desiredCapabilities.setCapability("noReset", "false");
        desiredCapabilities.setCapability("language", "TR");
        desiredCapabilities.setCapability("locale", "tr");

        //2.
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setAutomationName("UiAutomator2");
        uiAutomator2Options.setAppPackage("com.wt.apkinfo");
        uiAutomator2Options.setAppActivity("com.wt.apkinfo.activities.StartActivity");

        //  3.
        XCUITestOptions xcuiTestOptions = new XCUITestOptions();
        xcuiTestOptions.setPlatformName("iOS");
        xcuiTestOptions.setAutomationName("XCUITest");
        xcuiTestOptions.setBundleId("com.wt.apkinfo");

        //3 farklı driver:

        // hem ios hem de android
        AppiumDriver appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);
        // android
        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);
        //ios
        IOSDriver iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);

    }
}

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class main {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appPackage", "com.wt.apkinfo");
        desiredCapabilities.setCapability("appActivity", "com.wt.apkinfo.activities.StartActivity");
        desiredCapabilities.setCapability("noReset", "false");
        desiredCapabilities.setCapability("language", "TR");
        desiredCapabilities.setCapability("locale", "tr");


        //  app yüklemek için
        // desiredCapabilities.setCapability("app", "/Users/ibrahim/Downloads/apk-info.apk");

        // başlarken bir app çalıştırma

        //      desiredCapabilities.setCapability("appPackage", "trendyol.com");
        //      desiredCapabilities.setCapability("appActivity", "com.trendyol.common.splash.impl.ui.SplashActivity");


        AppiumDriver appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723"), desiredCapabilities);

        Thread.sleep(10000);
    }
}

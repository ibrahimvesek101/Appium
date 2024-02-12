import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IlkOrnek {


    @Test
    public void test01() throws MalformedURLException {
        UiAutomator2Options caps = new UiAutomator2Options();

        caps.setPlatformName("Android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("trendyol.com");
        caps.setAppActivity("com.trendyol.common.splash.impl.ui.SplashActivity");
        caps.setNoReset(false);

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.className("android.widget.TextView"));
        String elementText = element.getText();

        Assert.assertEquals(elementText, "Sana en uygun ürünleri sunabilmemiz için bize yardımcı olur musun?");

    }

    @Test
    public void test02() throws MalformedURLException {

        UiAutomator2Options caps = new UiAutomator2Options();

        caps.setPlatformName("Android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("trendyol.com");
        caps.setAppActivity("com.trendyol.common.splash.impl.ui.SplashActivity");
        caps.setNoReset(false);

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement erkek = driver.findElement(By.id("trendyol.com:id/buttonSelectGenderMan"));
        erkek.click();

        WebElement yeniUrunText = driver.findElement(By.id("trendyol.com:id/textViewOpenNotification"));
        Assert.assertTrue(yeniUrunText.isDisplayed());
    }

}


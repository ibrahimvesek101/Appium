import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KampanyaPage;
import pages.ManWomenPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IlkOrnek_Test_SonHali {
    AndroidDriver driver;
    ManWomenPage manWomenPage;
    KampanyaPage kampanyaPage;
    HomePage homePage;

    @BeforeMethod
    public void beforeTest() throws MalformedURLException {
        UiAutomator2Options caps = new UiAutomator2Options();

        caps.setPlatformName("Android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("trendyol.com");
        caps.setAppActivity("com.trendyol.common.splash.impl.ui.SplashActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        manWomenPage = new ManWomenPage(driver);
        kampanyaPage = new KampanyaPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void test01() {
        WebElement element = driver.findElement(By.className("android.widget.TextView"));
        String elementText = element.getText();

        Assert.assertEquals(elementText, "Sana en uygun ürünleri sunabilmemiz için bize yardımcı olur musun?");

    }

    @Test
    public void test02() {

        WebElement erkek = driver.findElement(By.id("trendyol.com:id/buttonSelectGenderMan"));
        erkek.click();

        WebElement yeniUrunText = driver.findElement(By.id("trendyol.com:id/textViewOpenNotification"));
        Assert.assertTrue(yeniUrunText.isDisplayed());
    }

    @Test
    public void test03() {
        WebElement erkek = driver.findElement(By.id("trendyol.com:id/buttonSelectGenderMan"));
        erkek.click();

        driver.findElement(By.id("trendyol.com:id/imageButtonClose")).click();
        driver.findElement(By.id("trendyol.com:id/textViewTooltipTitle")).getText();

        Assert.assertEquals(driver.findElement(By.id("trendyol.com:id/textViewTooltipTitle")).getText(), "Sana Özel Ürün ve Koleksiyonları Keşfet!");
    }

    @Test
    public void trendyolAcErkekButonaBas() throws InterruptedException {
        manWomenPage.clickErkekButton();
        Thread.sleep(7000);

    }

    @Test
    public void kampanyaTextVerify() throws InterruptedException {
        manWomenPage.clickErkekButton();
        Thread.sleep(1000);
        kampanyaPage.yeniUrunTextVerify();
        Thread.sleep(1000);
        kampanyaPage.kampanyaXButonuClick();
        Thread.sleep(5000);
    }

    @Test
    public void kampanyaXButtonClick() throws InterruptedException {
        manWomenPage.clickErkekButton();
        kampanyaPage.kampanyaXButonuClick();
        Thread.sleep(5000);

    }

    @Test
    public void maviKelimesiniAra() throws InterruptedException {
        manWomenPage.clickErkekButton();
        kampanyaPage.kampanyaXButonuClick();
        homePage.popupXButtonClick();
        homePage.searchClick();
        homePage.searchInput("mavi");
        homePage.pressEnter();
        System.out.println(homePage.getMaviPopupTitleText());
        homePage.popupXButtonClick();
        Thread.sleep(5000);

    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


}



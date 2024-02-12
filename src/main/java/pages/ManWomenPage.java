package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManWomenPage {
    AndroidDriver driver;

    public ManWomenPage(AndroidDriver webDriver) {
    driver=webDriver;

    }

    By carpıButonu = AppiumBy.id("trendyol.com:id/imageButtonClose");
    By image = AppiumBy.xpath("//android.widget.LinearLayout/android.widget.ImageView");
    By text = AppiumBy.className("android.widget.TextView");
    By erkekButonu = AppiumBy.id("trendyol.com:id/buttonSelectGenderMan");
    By kadınButonu = AppiumBy.id("trendyol.com:id/buttonSelectGenderWoman");

    /*
    By deneme1 = AppiumBy.androidUIAutomator("");
    By deneme2 = AppiumBy.iOSClassChain("");
    By deneme3= AppiumBy.iOSNsPredicateString("");
    By deneme4= AppiumBy.id("");
    By deneme5= AppiumBy.className("");


     */

    public void clickCarpıButton() {
        driver.findElement(carpıButonu).click();
    }

    public void checkImage() {
        driver.findElement(image);

    }

    public void getTextText() {
        driver.findElement(text).getText();
    }

    public void clickErkekButton() {
        driver.findElement(erkekButonu).click();
    }

    public void clickKadınButton() {
        driver.findElement(kadınButonu).click();

    }


}

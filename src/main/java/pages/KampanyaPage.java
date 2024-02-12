package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KampanyaPage {
    AndroidDriver driver;

    public KampanyaPage(AndroidDriver webDriver) {
        driver = webDriver;
    }

    By carpıButonu = By.id("trendyol.com:id/imageButtonClose");
    By yeniUrunText = By.id("trendyol.com:id/textViewOpenNotification");


    public void kampanyaXButonuClick() {

        driver.findElement(carpıButonu).click();
    }

    public void yeniUrunTextVerify() {

        System.out.println(driver.findElement(yeniUrunText).getText());

    }


}
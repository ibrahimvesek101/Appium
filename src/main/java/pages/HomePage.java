package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    AndroidDriver driver;

    public HomePage(AndroidDriver webDriver) {
        driver = webDriver;

    }

    By popupText = By.id("trendyol.com:id/textViewTooltipDescription");
    By popupXButton = By.id("trendyol.com:id/imageViewTooltipClose");
    By search = By.id("trendyol.com:id/edittext_search_view");
    By mavPopupTitle = By.id("trendyol.com:id/textViewTooltipTitle");


    public String popupGetText() {
        return driver.findElement(popupText).getText();
    }

    public void popupXButtonClick() {
        driver.findElement(popupXButton).click();
    }

    public void searchClick() {
        driver.findElement(search).click();

    }

    public void searchInput(String aranacakKelime) {
        driver.findElement(search).sendKeys(aranacakKelime);
    }

    public void pressEnter() {
        driver.pressKey(new KeyEvent(AndroidKey.SEARCH));
    }

    public String getMaviPopupTitleText() {
        return driver.findElement(mavPopupTitle).getText();
    }


}

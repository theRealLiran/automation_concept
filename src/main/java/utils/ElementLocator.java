package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementLocator extends WebDriverWait {

    public ElementLocator(AppiumDriver<MobileElement> driver, long timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    public WebElement waitForElementAppearance(String uiAutomator) {
        return this.until(ExpectedConditions.presenceOfElementLocated(new MobileBy.ByAndroidUIAutomator(uiAutomator)));
    }

    public WebElement waitForElementAppearance(WebElement element) {
        return this.until(ExpectedConditions.visibilityOf(element));
    }

    public List<WebElement> waitForAllElementsAppearance(List<WebElement> element) {
        return this.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public boolean waitForElementDisappearance(WebElement element) {
        return this.until(ExpectedConditions.invisibilityOf(element));
    }

    public boolean waitForAllElementsDisappearance(List<WebElement> element) {
        return this.until(ExpectedConditions.invisibilityOfAllElements(element));
    }
}

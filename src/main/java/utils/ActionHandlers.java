package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.interactions.touch.TouchActions;

public class ActionHandlers extends TouchActions {

    public ActionHandlers(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    void swipe(int x, int y) {
        this.move(x, y).perform();
    }
}

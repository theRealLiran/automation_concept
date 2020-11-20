package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScreenSizeUtil {

    AppiumDriver<MobileElement> driver;

    ScreenSizeUtil(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }


    int getScreenWidth() {
        return driver.manage().window().getSize().width;
    }

    int getScreenHeight() {
        return driver.manage().window().getSize().height;
    }
}

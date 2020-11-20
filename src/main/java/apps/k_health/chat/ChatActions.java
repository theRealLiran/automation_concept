package apps.k_health.chat;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.ElementLocator;
import utils.UiSelectorHelper;

public class ChatActions extends Elements {

    ChatActions(AppiumDriver<MobileElement> driver) {
        super(driver);
        locator = new ElementLocator(driver, 3);
    }

    ElementLocator locator;

    void selectQuestion(String question) {
        locator.waitForElementAppearance(UiSelectorHelper.findByText(question)).click();
    }

    void selectAnswer(String answer) {
        locator.waitForElementAppearance(UiSelectorHelper.findByText(answer)).click();
    }

}

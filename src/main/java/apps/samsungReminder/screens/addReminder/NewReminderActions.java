package apps.samsungReminder.screens.addReminder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.ElementLocator;

public class NewReminderActions extends Elements {

    public NewReminderActions(AppiumDriver<MobileElement> driver) {
        super(driver);
        elementLocator = new ElementLocator(driver, 2);
    }

    ElementLocator elementLocator;

    public void typeReminder(String content) {
        elementLocator.waitForElementAppearance(textField).sendKeys(content);
    }

    public void saveReminder() {
        elementLocator.waitForElementAppearance(saveReminderButton).click();
    }

    public void cancelReminder() {
        elementLocator.waitForElementAppearance(cancelReminderButton).click();
    }

    public void showColorReminderColorPalletDialog() {
        elementLocator.waitForElementAppearance(colorSelectorButton).click();
    }

    public void selectReminderBackgroundColor(ReminderBackgroundColor backgroundColor) {
        colorPalletButton.forEach(element -> {
            try {
                if (element.getAttribute("accessibility id").equals(backgroundColor.getColor())) {
                    elementLocator.waitForElementAppearance(element).click();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

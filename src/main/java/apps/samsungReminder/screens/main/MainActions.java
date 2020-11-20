package apps.samsungReminder.screens.main;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;

public class MainActions extends Elements {
    public MainActions(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void verifyHeaderDisplayed() {
        headerLabel.isDisplayed();
    }

    public void addNewReminder() {
        try {
            addNewReminderButton.click();
        } catch (NoSuchElementException e) {
            addNewReminderPlusButton.click();
        }
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void clickOnMenuButton() {
        menuButton.click();
    }
}

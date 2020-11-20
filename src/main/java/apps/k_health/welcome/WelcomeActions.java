package apps.k_health.welcome;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utils.ElementLocator;
import utils.UiSelectorHelper;

public class WelcomeActions extends Elements {
    WelcomeActions(AppiumDriver<MobileElement> driver) {
        super(driver);
        locator = new ElementLocator(driver, 3);
    }

    ElementLocator locator;

    void tapOnStartButton() {
        startButton.click();
    }

    void selectLanguage(Languages language) {
        selectLanguageButton.click();
        locator.waitForElementAppearance(UiSelectorHelper.findByText(language.toString())).click();
        languagePickerConfirmButton.click();
    }

    void confirmPrivacyPolicy() {
        privacyPolicyConfirmButton.click();
    }

    void enterName(String name) {
        enterNameTextField.sendKeys(name);
    }

    void tapOnConfirmNameButton() {
        confirmNameButton.click();
    }

    void selectGender(Gender gender) {
        locator.waitForElementAppearance(UiSelectorHelper.findByText(gender.toString())).click();
    }

    void selectBirthYear() {
        locator.waitForElementAppearance(UiSelectorHelper.findByText("1990")).click();
        birthYearConfirmButton.click();
    }
}

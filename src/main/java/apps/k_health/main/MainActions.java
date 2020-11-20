package apps.k_health.main;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MainActions extends Elements {

    public MainActions(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void tapOnCovidQuestionnaire() {
        covidQuestionnaireButton.click();
    }

    public void confirmCovidQuestionnaireInfo() {
        covidInfoConfirmButton.click();
    }
}

package k_health;

import apps.k_health.main.MainActions;
import org.testng.annotations.Test;

public class CovidChat extends BaseTest {

    @Test()
    void covid() {
        MainActions main = new MainActions(driverManager.getDriver());

        main.tapOnCovidQuestionnaire();
        main.confirmCovidQuestionnaireInfo();
    }
}

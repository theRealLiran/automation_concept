package samsung_reminder;

import apps.samsungReminder.screens.addReminder.NewReminderActions;
import apps.samsungReminder.screens.main.MainActions;
import k_health.BaseTest;
import org.testng.annotations.Test;

public class AddNewReminder extends BaseTest {

    @Test
    void addNewReminder() {
        MainActions mainActions = new MainActions(driverManager.getDriver());
        NewReminderActions reminderActions = new NewReminderActions(driverManager.getDriver());

        mainActions.addNewReminder();
        reminderActions.typeReminder("Survive Covid-19");
        reminderActions.saveReminder();
    }


}

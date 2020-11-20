package apps.samsungReminder.screens.addReminder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

enum ReminderBackgroundColor {
    RED, ORANGE, YELLOW, GREEN, BLUE, TEAL, PURPLE, NO_COLOR;

    String getColor() throws Exception {
        switch (this) {
            case RED:
                return "אדום";

            case ORANGE:
                return "כתום";

            case YELLOW:
                return "צהוב";

            case GREEN:
                return "ירוק";

            case BLUE:
                return "כחול";

            case TEAL:
                return "טורקיז";

            case PURPLE:
                return "סגול";

            case NO_COLOR:
                return "ללא";

            default:
                throw new Exception("Selected Color is not defined");
        }
    }
}

class Elements {

    Elements(AppiumDriver<MobileElement> driver) {
            PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(2)), this);
    }

    private final String TEXT_FIELD = "add_viewholder_text";
    private final String COLOR_SELECTOR_BUTTON = "add_color_picker_btn";
    private final String CANCEL_REMINDER_BUTTON = "action_cancel_reminder";
    private final String SAVE_REMINDER_BUTTON = "action_save_reminder";

    //Reminder background color picker dialog
    private final String COLOR_PALLET_BUTTON = "color_background";
    private final String COLOR_PALLET_CANCEL_BUTTON = "button3";

    @AndroidFindBy(id = TEXT_FIELD)
    MobileElement textField;

    @AndroidFindBy(id = COLOR_SELECTOR_BUTTON)
    MobileElement colorSelectorButton;

    @AndroidFindBy(id = CANCEL_REMINDER_BUTTON)
    MobileElement cancelReminderButton;

    @AndroidFindBy(id = SAVE_REMINDER_BUTTON)
    MobileElement saveReminderButton;

    //Reminder background color picker dialog
    @AndroidFindBy(id = COLOR_PALLET_BUTTON)
    List<MobileElement> colorPalletButton;

    @AndroidFindBy(id = COLOR_PALLET_CANCEL_BUTTON)
    MobileElement colorPalletCancelButton;


}

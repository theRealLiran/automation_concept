package apps.samsungReminder.screens.main;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

class Elements {

    Elements(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(2)), this);
    }

    private final String HEADER_LABEL = "collpasing_app_bar_extended_title";
    private final String MENU_BUTTON = "אפשרויות נוספות , תוכן חדש זמין";
    private final String SEARCH_BUTTON = "list_action_search";
    private final String ADD_REMINDER_BUTTON = "create_item";
    private final String ADD_REMINDER_PLUS_BUTTON = "list_create";

    @AndroidFindBy(id = HEADER_LABEL)
    MobileElement headerLabel;

    @AndroidFindBy(id = ADD_REMINDER_BUTTON)
    MobileElement addNewReminderButton;

    @AndroidFindBy(id = ADD_REMINDER_PLUS_BUTTON)
    MobileElement addNewReminderPlusButton;

    @AndroidFindBy(id = MENU_BUTTON)
    MobileElement menuButton;

    @AndroidFindBy(id = SEARCH_BUTTON)
    MobileElement searchButton;
}

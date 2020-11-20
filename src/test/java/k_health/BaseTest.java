package k_health;

import managers.DesiredCapsManager;
import managers.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public BaseTest() {
        driverManager = new DriverManager(DriverManager.PlatformType.ANDROID, new DesiredCapsManager());
    }

    protected final DriverManager driverManager;

    @BeforeTest
    void init() throws Exception {
        driverManager.startSession();
    }

    @AfterTest
    void terminate() {
        driverManager.endSession();
    }

}

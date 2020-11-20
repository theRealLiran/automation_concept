package managers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;


public class DriverManager {
    public DriverManager(PlatformType platform, DesiredCapsManager caps) {
        this.platform = platform;
        this.caps = caps;
        this.serviceManager = new AppiumServiceManager();
    }

    public enum PlatformType {
        IOS, ANDROID
    }

    private AppiumDriver<MobileElement> driver;
    private final PlatformType platform;
    private final DesiredCapsManager caps;
    private final AppiumServiceManager serviceManager;

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public void startSession() throws Exception {
        switch (platform) {
            case IOS:
                driver = new IOSDriver<>(serviceManager.startServer(), caps.getIOSCaps());
                break;

            case ANDROID:
                driver = new AndroidDriver<>(serviceManager.startServer(), caps.getAndroidCaps());
                break;

            default:
                throw new RuntimeException("Desired platform does not exist");
        }
    }

    public void endSession() {
        driver.quit();
    }
}

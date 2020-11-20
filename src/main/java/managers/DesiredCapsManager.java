package managers;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.AppsInfo;

public class DesiredCapsManager extends DesiredCapabilities {

    /**
     * Troubleshooting
     * https://github.com/appium/appium/blob/master/docs/en/writing-running-appium/android/activity-startup.md
     */

    DesiredCapabilities getAndroidCaps() throws Exception {
        this.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung S8");
        this.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator1");
        this.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, AppsInfo.K_HEALTH.getPackage());
        this.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, AppsInfo.K_HEALTH.getActivity());
        this.setCapability(MobileCapabilityType.NO_RESET, true);
        return this;
    }

    DesiredCapabilities getIOSCaps() {
        this.setCapability(MobileCapabilityType.DEVICE_NAME, "");
        this.setCapability(MobileCapabilityType.AUTOMATION_NAME, "");
        this.setCapability(MobileCapabilityType.NO_RESET, false);
        this.setCapability(MobileCapabilityType.UDID, "");
        this.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "");
        this.setCapability(IOSMobileCapabilityType.USE_PREBUILT_WDA, true);
        return this;
    }

}

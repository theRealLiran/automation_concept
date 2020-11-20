package managers;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import utils.AppiumServerArgs;

public class AppiumServiceManager {

    private AppiumDriverLocalService server;

    AppiumDriverLocalService startServer() {
        String ipAddress = "127.0.0.1";

        AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        serviceBuilder.usingAnyFreePort();
        serviceBuilder.withIPAddress(ipAddress)
                .withArgument(AppiumServerArgs.LOG_LEVEL, AppiumServerArgs.LOG_LEVEL.INFO_DEBUG)
                .withArgument(AppiumServerArgs.LOG_TIMESTAMP)
                .withArgument(AppiumServerArgs.LOG_SPACING)
                .withArgument(AppiumServerArgs.LOCAL_TIME_ZONE)
                .withArgument(AppiumServerArgs.STRICT_CAPABILITIES)
                .withArgument(AppiumServerArgs.RELAXED_SECURITY);

        server = AppiumDriverLocalService.buildService(serviceBuilder);

        if (!server.isRunning()) {
            System.out.println("Starting Server");
            server.start();
        }

        return server;
    }

    void stopServer() {
        if (server.isRunning()) {
            System.out.println("Stopping Server");
            server.stop();
        }
    }

}

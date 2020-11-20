package utils;

import io.appium.java_client.service.local.flags.ServerArgument;

public enum AppiumServerArgs implements ServerArgument {

    /**
     * Cause sessions to fail if desired caps are sent in that Appium does not recognize as valid for the selected device
     */
    STRICT_CAPABILITIES("--strict-caps"),

    /**
     * Absolute path to directory Appium can use to manage temporary files, like built-in iOS apps it needs to move around.
     * On *nix/Mac defaults to /tmp, on Windows defaults to C:\Windows\Temp
     */
    TEMP_DIRECTORY("--tmp"),

    TIMEOUT("--command-timeout"),

    /**
     * Enables NodeJS memory dumps collection feature. This feature is extremely useful for finding memory leaks.
     */
    MEM_DUMP("--enable-heapdump"),

    /**
     * Use local timezone for timestamps
     */
    LOCAL_TIME_ZONE("--local-timezone"),

    /**
     * Show timestamps in console output
     */
    LOG_TIMESTAMP("--log-timestamp"),

    /**
     * Set the server log level for console and logfile (specified as console-level:logfile-level,
     * with both being the same if only one value is supplied).
     * Possible values are debug, info, warn, error, which are progressively less verbose.
     */
    LOG_LEVEL("--log-level"),

    /**
     * Add exaggerated spacing in logs to help with visual inspection
     */
    LOG_SPACING("--debug-log-spacing"),

    /**
     * Disable additional security checks, so it is possible to use some advanced features,
     * provided by drivers supporting this option.
     * Only enable it if all the clients are in the trusted network and it is not the case if a client could
     * potentially break out of the session sandbox.
     */
    RELAXED_SECURITY("--relaxed-security"),

    /**
     * (iOS-only) How many times to retry launching Instruments before saying it crashed or timed out
     */
    IOS_INSTRUMENTS_LAUNCH_RETRIES("-r, --backend-retries");

    private final String arg;

    AppiumServerArgs(String arg) {
        this.arg = arg;
    }


    public final String WARNING = "warn";
    public final String WARNING_INFO = "warn:info";
    public final String WARNING_ERROR = "warn:error";
    public final String INFO = "info";
    public final String INFO_INFO = "info:info";
    public final String INFO_DEBUG = "info:debug";
    public final String DEBUG = "debug";
    public final String ERROR = "error";

    @Override
    public String getArgument() {
        return arg;
    }
}

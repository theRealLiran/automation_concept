package utils;

public enum AppsInfo {
    K_HEALTH, SAMSUNG_REMINDER, YOUTUBE;

    public String getActivity() throws Exception {
        switch (this) {
            case K_HEALTH:
                return "ai.kanghealth.MainActivity";

            case SAMSUNG_REMINDER:
                return "com.samsung.android.app.reminder.ui.LaunchMainActivity";

            case YOUTUBE:
                return "";

            default:
                throw new Exception("Desired Activity is not defined in scope");
        }
    }

    public String getPackage() throws Exception {
        switch (this) {
            case K_HEALTH:
                return "ai.kanghealth";

            case SAMSUNG_REMINDER:
                return "com.samsung.android.app.reminder";

            case YOUTUBE:
                return "";

            default:
                throw new Exception("Desired Activity is not defined in scope");
        }


    }
}

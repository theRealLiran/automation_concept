package utils;

public class UiSelectorHelper {

    public static String findByText(String text) {
        return "new UiSelector().text(" + text + ")";
    }

    public static String findByTextContains(String text) {
        return "new UiSelector().textContains(" + text + ")";
    }

    public static String findByTextStartsWith(String text) {
        return "new UiSelector().textStartsWith(" + text + ")";
    }

    public static String findByClassName(String className) {
        return "new UiSelector().className(" + className + ")";
    }


}

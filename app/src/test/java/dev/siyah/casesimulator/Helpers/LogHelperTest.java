package dev.siyah.casesimulator.Helpers;

import org.junit.Test;

public class LogHelperTest {
    @SuppressWarnings("ConstantConditions")
    @Test(expected = NullPointerException.class)
    public void testErrorNullException() {
        LogHelper logHelper = new LogHelper();

        logHelper.error("asdsa", (Exception) null);
    }

    @Test(expected = RuntimeException.class)
    public void error() {
        LogHelper logHelper = new LogHelper();

        Exception exception = new Exception();

        logHelper.error("asdsa", exception);
    }

    @Test(expected = RuntimeException.class)
    public void testError() {
        LogHelper logHelper = new LogHelper();

        logHelper.error("asdsa", "exception");
    }
}
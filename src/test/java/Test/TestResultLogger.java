package Test;


import logger.Log;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;


public class TestResultLogger implements TestWatcher {
    Log log = new Log();

    public void testDisabled(ExtensionContext context, Optional<String> reason) {

    }
    public void testAborted(ExtensionContext context, Throwable cause) {

    }
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        String testFailCause = cause.getMessage();
        log.error(testName + " FAILED : " + testFailCause);
    }
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        log.info(testName + "PASSED");
    }


}

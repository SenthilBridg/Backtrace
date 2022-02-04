package com.bridg.backtrace;

import org.junit.Test;

public class JavaBtIntegrationTest {

    @Test
    public void verifyNoExceptionThrown() {
        JavaBtIntegration.main(new String[]{});
    }
}
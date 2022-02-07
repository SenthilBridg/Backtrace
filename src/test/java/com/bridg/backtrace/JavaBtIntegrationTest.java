package com.bridg.backtrace;

import org.junit.Test;

public class JavaBtIntegrationTest {

    @Test
    public void verifyNoExceptionThrown() throws IllegalAccessException {
        JavaBtIntegration.main(new String[]{});
    }
}
package com.bridg.backtrace;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class JavaBtIntegration {
	
    private static final Logger logger = LogManager.getLogger(JavaBtIntegration.class);

	public static void main(String[] args) {
        logger.debug("Debugging... !");
        logger.info("Info message!");
        logger.warn("Warning!");
        logger.error("Sorry, something wrong!");
    }
}

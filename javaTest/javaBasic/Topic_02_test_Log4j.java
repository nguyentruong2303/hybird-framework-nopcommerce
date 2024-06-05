package javaBasic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Topic_02_test_Log4j {


	    // Tạo logger
    private static final Logger log = LogManager.getLogger(Topic_02_test_Log4j.class);

	    public static void main(String[] args) {

	    	log.debug("Debug message");
	        log.info("Info message");
	        log.warn("Warn message");
	        log.error("Error message");
	        log.fatal("Fatal message");

	        
	        System.out.println("Test log");
	    }
}


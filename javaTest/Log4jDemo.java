

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	protected static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		System.out.println("Hello");
		logger.info("This is message info");
		logger.error("This is message error");
		logger.warn("This is message warn");
		logger.fatal("This is message fatal");
		
		System.out.println("\n Complete");

	}

}

package alpha;


import org.apache.logging.log4j.*;
public class Demo {

	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// 6/12/2019

		log.debug("It's debug message");
		log.error("It's an error message");
		log.warn("It's an warn message");
		log.trace("It's an trace message");
		log.info("It's an info message");
		log.fatal("It'a an fatal message");
		log.debug("It's debug message");
		log.error("error message");
		log.warn(" warn message");
		log.trace(" trace message");
		log.info(" info message");
		log.fatal(" fatal message");
		log.debug("message");
		
	}
}
package beta;


import org.apache.logging.log4j.*;
public class Demo1 {

	
	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// 6/12/2019

		log.debug("It's debug message");
		log.error("It's an error message");
		log.warn("It's an warn message");
		log.trace("It's an trace message");
		log.info("It's an info message");
		log.fatal("It'a an fatal message");
		log.trace("It's an trace message");
		// its print package name and class name System.out.println(log.getName());
	}

}

package Java8Practice.design.patterns.creational.singleton;

//SIngleton Design pattern
public class Logger {
	
	private static Logger logger;
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}

}

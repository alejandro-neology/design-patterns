/**
 * 
 */
package com.raidentrance.adapter;

/**
 * @author alejandrobautista
 *
 */
public class LoggerAdapter implements ConsoleLogger {
	
	private LoggerStandardOutput logger = new LoggerStandardOutput();

	@Override
	public void log(String message) {
		logger.logMessage(message);
	}

}

/**
 * 
 */
package com.raidentrance.adapter;

/**
 * @author alejandrobautista
 *
 */
public class Logger {

	private ConsoleLogger consoleLogger;

	public Logger(ConsoleLogger consoleLogger) {
		this.consoleLogger = consoleLogger;
	}

	public void log(String out) {
		consoleLogger.log(out);
	}
}

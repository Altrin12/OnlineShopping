package com.loggerrr;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logger_BasicConfiguration {

	public static Logger log = Logger.getLogger(Logger_BasicConfiguration.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();

		log.debug("Debug");
		log.info("Info");
		log.warn("Warn");
		log.error("Error");
		log.fatal("Fatal");

	}
}

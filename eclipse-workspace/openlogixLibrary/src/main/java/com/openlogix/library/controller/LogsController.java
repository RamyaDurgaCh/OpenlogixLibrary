package com.openlogix.library.controller;
import org.apache.logging.log4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogsController {
	 Logger logger =LogManager.getLogger(LogsController.class.getName());
		@GetMapping("/message")
		public String index(){
			
			
		
		logger.info("successfully added logs to your application");
		logger.info("inside add book method");
		logger.error("DB connection failed");
		logger.debug("This is debugging");
		logger.fatal("This is Fatal");
		return "Check the logs to see the output";
		}	
		
		
	}
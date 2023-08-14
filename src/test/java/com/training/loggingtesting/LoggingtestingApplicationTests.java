package com.training.loggingtesting;

import org.apache.juli.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class LoggingtestingApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingtestingApplicationTests.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingtestingApplicationTests.class);
		LOGGER.info("Simple log statements {} {} {}", "data1","data2","data3");
		LOGGER.info("This is a test log statement!");

	}

	@Test
	void contextLoads() {
	}

}

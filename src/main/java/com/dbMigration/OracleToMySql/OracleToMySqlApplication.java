package com.dbMigration.OracleToMySql;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class OracleToMySqlApplication {
	private static final Logger logger = LogManager.getLogger(OracleToMySqlApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OracleToMySqlApplication.class, args);
		logger.info(">>>>>>>>>>>>>>>>>>>>>> You're inside the application to migrate the data from Oracle to MySql <<<<<<<<<<<<<<<<<<<<<<<<<");
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

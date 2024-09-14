package com.dbMigration.OracleToMySql.Config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(MyCommandLineRunner.class);

    @Autowired
    private final RestTemplate restTemplate;
    private final String endpointUrl;

    @Autowired
    public MyCommandLineRunner(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.endpointUrl = "http://localhost:9090/jobs/importJob";
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(">>>>>>>>>>>>>>>>>>>>>> You're inside the application to migrate the data from Oracle to MySql <<<<<<<<<<<<<<<<<<<<<<<<<");

        // request mapping endpoint
        restTemplate.postForObject(endpointUrl, null, Void.class);

        // Exit the application after successful push
        logger.info("Migration successful. Exiting application...");
        System.exit(0);
    }
}
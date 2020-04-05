package com.indrajit.springboot.restful;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private Environment environment;

    @Override
    public void run(String... args) throws Exception {

        logger.info("\n----Begin logging Application----");

        logger.info("----System Properties from VM Arguments----");
        logger.info("server.port: " + System.getProperty("server.port"));
        logger.info("----Program Arguments----");
        for (String arg : args) {
            logger.info(arg);
        }

        logger.info("----Environment Properties----");
        logger.info("spring.datasource.url: " + environment.getProperty("spring.datasource.url"));
        logger.info("spring.datasource.username: " + environment.getProperty("spring.datasource.username"));
        logger.info("spring.datasource.password: " + environment.getProperty("spring.datasource.password"));
        logger.info("spring.jpa.database-platform: " + environment.getProperty("spring.jpa.database-platform"));
        logger.info("spring.jpa.hibernate.ddl-auto: " + environment.getProperty("spring.jpa.hibernate.ddl-auto"));

        logger.info("MYSQL_ROOT_PASSWORD: " + System.getenv("MYSQL_ROOT_PASSWORD"));
        logger.info("MYSQL_USER: " + System.getenv("MYSQL_USER"));
        logger.info("MYSQL_PASSWORD: " + System.getenv("MYSQL_PASSWORD"));
        logger.info("MYSQL_DATABASE: " + System.getenv("MYSQL_DATABASE"));

        logger.info("----End logging Application----");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

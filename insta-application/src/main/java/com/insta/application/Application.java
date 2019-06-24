package com.insta.application;

import com.insta.application.constants.Constant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = Constant.INSTA_REPLICA_BASE_PACKAGE)
@ComponentScan({Constant.INSTA_REPLICA_BASE_PACKAGE})
public class Application {
    public static void main(String args[]) {

        SpringApplication.run(Application.class, args);

    }
}

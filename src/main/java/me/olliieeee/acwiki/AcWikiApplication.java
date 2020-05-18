package me.olliieeee.acwiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class AcWikiApplication {
    public static void main(String[] args) {
        SpringApplication.run(AcWikiApplication.class, args);
    }
}


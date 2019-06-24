package com.insta.application.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;


@Configuration
public class CustomMongoTemplate {

    @Value("${spring.data.mongodb.database}")
    private String db;
    @Value("${spring.profiles.active}")
    private String profile;
    private String url = System.getProperty("spring.data.mongodb.uri");

    public @Bean
    MongoDbFactory mongoDbFactory() {

        if (profile.equals("local")) {
            return new SimpleMongoDbFactory(new MongoClient(), this.db);
        } else {
            MongoClientURI uri = new MongoClientURI(url);
            return new SimpleMongoDbFactory(new MongoClient(uri), this.db);
        }
    }

    public @Bean
    MongoTemplate mongoTemplate() {
        //remove _class
        MappingMongoConverter converter =
                new MappingMongoConverter(mongoDbFactory(), new MongoMappingContext());
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory(), converter);

        return mongoTemplate;
    }
}

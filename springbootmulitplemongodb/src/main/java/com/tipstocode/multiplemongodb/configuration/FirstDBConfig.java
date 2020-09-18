package com.tipstocode.multiplemongodb.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;


@Configuration 
@ConfigurationProperties(prefix = "firstdb.config") //This prefix points to first_db properties. Please check application.properties
public class FirstDBConfig extends AbstractMongoDBConfiguration {
   
    @Primary
    @Override
    @Bean(name = "firstDBMongoTemplate")
    public MongoTemplate getMongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }
}
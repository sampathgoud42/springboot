package com.tipstocode.multiplemongodb.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;


@Configuration
@ConfigurationProperties(prefix = "seconddb.config") //This prefix points to second_db properties. Please check application.properties
public class SecondDBConfig extends AbstractMongoDBConfiguration{
	
    
    @Bean(name = "secondDBMongoTemplate")
    public MongoTemplate getMongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

}

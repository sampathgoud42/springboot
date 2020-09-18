package com.tipstocode.multiplemongodb.configuration;

import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

public abstract class AbstractMongoDBConfiguration {
    //Mongo DB Properties    
    private String host;
    
    private String database;
    
    private int port;

    public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	//**This method is used to create MongoDb Factory which is common to all databases
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(host, port), database);
    }

     
    //**Create MongoTemplate using Factory Method
    abstract public MongoTemplate getMongoTemplate() throws Exception;
}
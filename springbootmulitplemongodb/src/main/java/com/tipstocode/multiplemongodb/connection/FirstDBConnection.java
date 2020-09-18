package com.tipstocode.multiplemongodb.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;

public class FirstDBConnection {
	
	@Autowired	
	@Qualifier("firstDBMongoTemplate") 
	private MongoTemplate mongoTemplate;	

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	//This method is used to check whether mongoTemplate is created or not
	protected void checkDaoConfig() throws IllegalArgumentException {
		if (this.mongoTemplate == null) {
			throw new IllegalArgumentException("'mongoTemplate' is required");
		}
	}

	

}

package com.tipstocode.multiplemongodb.dao;

import org.springframework.stereotype.Repository;

import com.tipstocode.multiplemongodb.connection.FirstDBConnection;
import com.tipstocode.multiplemongodb.firstdb.model.FirstModel;

@Repository
public class FirstDBDAOImpl extends FirstDBConnection implements FirstDBDAO{

	@Override
	public void saveFirstModel(FirstModel firstModel) {
		// TODO Auto-generated method stub
		//**This mongoTemplate is a reference of first_db created from FirstDBConnection
		getMongoTemplate().save(firstModel);
	}
	
	
	

}

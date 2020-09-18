package com.tipstocode.multiplemongodb.dao;

import org.springframework.stereotype.Repository;

import com.tipstocode.multiplemongodb.connection.SecondDBConnection;
import com.tipstocode.multiplemongodb.seconddb.model.SecondModel;

@Repository
public class SecondDBDAOImpl extends SecondDBConnection implements SecondDBDAO{
	
	
	@Override
	public void saveSecondModel(SecondModel saveSecondModel) {
		// TODO Auto-generated method stub
		//**This mongoTemplate is a reference of second_db created from SecondDBConnection
		 getMongoTemplate().save(saveSecondModel);
	}
	
	

}

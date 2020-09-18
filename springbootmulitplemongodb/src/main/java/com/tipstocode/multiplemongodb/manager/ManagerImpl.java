package com.tipstocode.multiplemongodb.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tipstocode.multiplemongodb.dao.FirstDBDAO;
import com.tipstocode.multiplemongodb.dao.SecondDBDAO;
import com.tipstocode.multiplemongodb.firstdb.model.FirstModel;
import com.tipstocode.multiplemongodb.seconddb.model.SecondModel;

@Component
public class ManagerImpl implements Manager{
	
	@Autowired	
	FirstDBDAO firstDBDAO;
	
	@Autowired
	SecondDBDAO secondDBDAO;

	public void saveFirstModel(FirstModel firstModel) {
		// TODO Auto-generated method stub
		firstDBDAO.saveFirstModel(firstModel);
	}

	@Override
	public void saveSecondModel(SecondModel saveSecondModel) {
		// TODO Auto-generated method stub
		secondDBDAO.saveSecondModel(saveSecondModel);
	}


}

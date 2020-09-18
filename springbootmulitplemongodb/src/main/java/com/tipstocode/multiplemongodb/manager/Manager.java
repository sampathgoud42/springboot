package com.tipstocode.multiplemongodb.manager;

import com.tipstocode.multiplemongodb.firstdb.model.FirstModel;
import com.tipstocode.multiplemongodb.seconddb.model.SecondModel;



public interface Manager {

	void saveFirstModel(FirstModel firstModel);

	void saveSecondModel(SecondModel secondModel);


}

package com.tipstocode.multiplemongodb.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tipstocode.multiplemongodb.firstdb.model.FirstModel;
import com.tipstocode.multiplemongodb.manager.Manager;
import com.tipstocode.multiplemongodb.seconddb.model.SecondModel;

@RestController
public class Controller {
	
	
	@Autowired
	Manager manager;
	
	//save 'FirstModel' collection to 'first_db' database
	@RequestMapping(value = "/savefirstmodel", method = RequestMethod.POST )
	public ResponseEntity<String> saveFirstModel(@RequestBody FirstModel firstModel) {		
		
		manager.saveFirstModel(firstModel);		
		return new ResponseEntity<String>("Saved", HttpStatus.OK);
	}
	
	//save 'SecondModel' collection to 'second_db' database
	@RequestMapping(value = "/savesecondmodel", method = RequestMethod.POST )
	public ResponseEntity<String> saveSecondModel(@RequestBody SecondModel secondModel) {		
		
		manager.saveSecondModel(secondModel);		
		return new ResponseEntity<String>("Saved", HttpStatus.OK);
	}
		

	

}

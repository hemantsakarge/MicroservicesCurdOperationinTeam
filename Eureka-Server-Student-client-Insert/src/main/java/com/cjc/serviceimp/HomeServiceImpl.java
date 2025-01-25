package com.cjc.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}
	
	

}

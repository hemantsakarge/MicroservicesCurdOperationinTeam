package com.crud.cjc.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.cjc.main.model.Student;
import com.crud.cjc.main.repository.StudentRepository;
import com.crud.cjc.main.service.StudentService;
@Service
public class StudentImpl implements StudentService{

	@Autowired
	StudentRepository sr;
	@Override
	public List<Student> getAllData() {
		return sr.findAll();
	}
	@Override
	public Student findByRoll(int roll) {
		// TODO Auto-generated method stub
		return sr.findByRoll(roll);
	}

}

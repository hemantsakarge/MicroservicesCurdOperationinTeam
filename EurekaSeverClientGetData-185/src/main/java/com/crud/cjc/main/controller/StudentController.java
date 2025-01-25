package com.crud.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.cjc.main.model.Student;
import com.crud.cjc.main.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	@GetMapping("/getAllData")
	public List<Student> getData() {
		List<Student> list=ss.getAllData();
		return list;
	}
	@GetMapping("/getDataById/{roll}")
	public Student getByRoll(@PathVariable("roll") int roll) {
		Student s=ss.findByRoll(roll);
		return s;
	}
}

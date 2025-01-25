package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	
	@PostMapping("/insertData")
	public String insert(@RequestBody Student s)
	{
		
		hs.saveData(s);
		return "SaveData";
	}
	
	
}

package com.cg.iter.feedbackmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.feedbackmanagementsystem.dto.Feedback;
import com.cg.iter.feedbackmanagementsystem.service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
//	Feedback Entry
	@GetMapping("/addfeedback")
	void addFeedback(@RequestBody Feedback feedback) {
		studentService.addFeedback(feedback);
	}
	
}

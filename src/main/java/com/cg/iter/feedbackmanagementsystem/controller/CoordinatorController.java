package com.cg.iter.feedbackmanagementsystem.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.feedbackmanagementsystem.dao.FeedbackDao;
import com.cg.iter.feedbackmanagementsystem.dao.TrainingProgramDao;
import com.cg.iter.feedbackmanagementsystem.dto.Enrollment;
import com.cg.iter.feedbackmanagementsystem.dto.Feedback;
import com.cg.iter.feedbackmanagementsystem.dto.Student;
import com.cg.iter.feedbackmanagementsystem.dto.TrainingProgram;
import com.cg.iter.feedbackmanagementsystem.service.EnrollmentService;
import com.cg.iter.feedbackmanagementsystem.service.FeedbackService;
import com.cg.iter.feedbackmanagementsystem.service.StudentService;
import com.cg.iter.feedbackmanagementsystem.service.TrainingProgramService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/coordinator")
public class CoordinatorController {

	@Autowired
	private TrainingProgramService trainingProgramService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private EnrollmentService enrollmentService;
	
	@Autowired
	private FeedbackService feedbackService;
	
	
//	Training program Maintenance
	@PostMapping("/trainingprograms")
	public void createTrainingProgram(TrainingProgram trainingProgram) {
		trainingProgramService.create(trainingProgram);
	}
	
	@GetMapping("/trainingprograms")
	public List<TrainingProgram> getAllTrainingPrograms() {
		return trainingProgramService.getAllTrainingPrograms();
		
	}
	
	@PutMapping("/trainingprograms")
	public void updateTrainingProgram(TrainingProgram trainingProgram) {
		trainingProgramService.update(trainingProgram);
	}
	
	

	@PostMapping("/enroll")
	public void enrollParticipant(@RequestBody Enrollment enrollment) {
		enrollmentService.addEnrollment(enrollment);
	}
	
	@GetMapping("/studentlist")
	List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	

	
//	View Feedback Report
	
	@GetMapping("/defaulters")
	public List<Student> viewDefaultList() {
		Feedback fb = null;
		TrainingProgram tp = null;
		return feedbackService.viewDefaulterList(tp, fb);
		
	}
	
	@GetMapping("/feedbacks")
	public List<Feedback> viewReport() {
		return feedbackService.viewFeedbackReport();
		
	}

	
}

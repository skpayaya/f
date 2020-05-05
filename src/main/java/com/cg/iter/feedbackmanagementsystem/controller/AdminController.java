package com.cg.iter.feedbackmanagementsystem.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.feedbackmanagementsystem.dto.Course;
import com.cg.iter.feedbackmanagementsystem.dto.Feedback;
import com.cg.iter.feedbackmanagementsystem.dto.Student;
import com.cg.iter.feedbackmanagementsystem.dto.Trainer;
import com.cg.iter.feedbackmanagementsystem.dto.TrainingProgram;
import com.cg.iter.feedbackmanagementsystem.service.CourseService;
import com.cg.iter.feedbackmanagementsystem.service.FeedbackService;
import com.cg.iter.feedbackmanagementsystem.service.TrainerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private FeedbackService feedbackService;
	
	@Autowired
	private TrainerService trainerService;
	
//	Faculty skill Maintenance
	
	@GetMapping("/trainers")
	public List<Trainer> getAllTrainers() {
		return trainerService.getAlltrainers();
	}
	
	@GetMapping("/trainers/{id}")
	public Trainer getTrainerById(@PathVariable("id") int id) {
		return trainerService.getTrainerById(id);
	}
	
	@PutMapping("/trainers/{id}")
	public void updateSkillsTrainer(@RequestBody Trainer trainer,@PathVariable("id") int id) {
		
		trainerService.updatetrainer(trainer,id);
	}

//	Course Maintenance
	
	@GetMapping("/courses")
	public List<Course> getAllCourseDetails() {
		return courseService.getAllCourse();
		
	}
	
	@PutMapping("/updatecourse")
	public void updateCourse(@RequestBody Course course) {
		courseService.updateCourse(course);
		
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


	@PostConstruct
	public void ad(){
		courseService.addCourse(new Course("JAVA",12));
		courseService.addCourse(new Course("C",12));
		
		
		Set<String> skillset=new HashSet<>();
		Set<String> skillset1=new HashSet<>();
		skillset.add("JAVA");
		skillset.add("C");
		trainerService.addtrainer(new Trainer("Sashi",skillset));
		skillset1.add("JAVA");
		skillset1.add("C");
		trainerService.addtrainer(new Trainer("Sashi2",skillset1));
		
		
	}
}

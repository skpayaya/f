package com.cg.iter.feedbackmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.feedbackmanagementsystem.controller.StudentController;
import com.cg.iter.feedbackmanagementsystem.dao.FeedbackDao;
import com.cg.iter.feedbackmanagementsystem.dao.StudentDao;
import com.cg.iter.feedbackmanagementsystem.dto.Feedback;
import com.cg.iter.feedbackmanagementsystem.dto.Student;
import com.cg.iter.feedbackmanagementsystem.dto.TrainingProgram;

@Service
public class FeedbackService implements IFeedbackService {

	@Autowired
	private FeedbackDao feedbackDao;
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Feedback> viewFeedbackReport() {
		return feedbackDao.findAll();

	}
	@Override
	public List<Student> viewDefaulterList(TrainingProgram tp,Feedback fb)
	{
		List<Feedback> feedbackList = feedbackDao.findAll();
		List<Student> students = studentDao.findAll();
		
		
		return students;
		
	}
}

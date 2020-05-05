package com.cg.iter.feedbackmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cg.iter.feedbackmanagementsystem.dao.FeedbackDao;
import com.cg.iter.feedbackmanagementsystem.dao.StudentDao;
import com.cg.iter.feedbackmanagementsystem.dto.Feedback;
import com.cg.iter.feedbackmanagementsystem.dto.Student;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private FeedbackDao feedbackDao;
	@Override
	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}
	@Override
	public void addFeedback(Feedback feedback) {
		
		feedbackDao.save(feedback);
		
	}

}

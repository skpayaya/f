package com.cg.iter.feedbackmanagementsystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.feedbackmanagementsystem.dao.EnrollmentDao;
import com.cg.iter.feedbackmanagementsystem.dao.StudentDao;
import com.cg.iter.feedbackmanagementsystem.dao.TrainingProgramDao;
import com.cg.iter.feedbackmanagementsystem.dto.Enrollment;
import com.cg.iter.feedbackmanagementsystem.dto.Student;
import com.cg.iter.feedbackmanagementsystem.dto.TrainingProgram;

@Service
public class EnrollmentService implements IEnrollmentService{

	@Autowired
	private EnrollmentDao enrollmentDao;
	
	@Autowired
	private TrainingProgramDao trainingProgramDao;
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void addEnrollment(int studentId,int programId) {
		
		TrainingProgram trainingProgram = trainingProgramDao.getOne(programId);
		Student student = studentDao.getOne(studentId);
		
		Enrollment enrollment = new Enrollment(student,trainingProgram);
		enrollmentDao.save(enrollment);
	}

	@Override
	public void addEnrollment(Enrollment enrollment) {
		enrollmentDao.save(enrollment);
		
	}
	
}

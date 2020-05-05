package com.cg.iter.feedbackmanagementsystem.service;

import com.cg.iter.feedbackmanagementsystem.dto.Enrollment;

public interface IEnrollmentService {

	void addEnrollment(int studentId, int programId);

	void addEnrollment(Enrollment enrollment);

}

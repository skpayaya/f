package com.cg.iter.feedbackmanagementsystem.service;

import java.util.List;

import com.cg.iter.feedbackmanagementsystem.dto.Feedback;
import com.cg.iter.feedbackmanagementsystem.dto.Student;
import com.cg.iter.feedbackmanagementsystem.dto.TrainingProgram;

public interface IFeedbackService {

	List<Student> viewDefaulterList(TrainingProgram tp, Feedback fb);

	List<Feedback> viewFeedbackReport();

}

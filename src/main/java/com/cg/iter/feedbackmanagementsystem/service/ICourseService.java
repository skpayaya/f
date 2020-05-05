package com.cg.iter.feedbackmanagementsystem.service;

import java.util.List;

import com.cg.iter.feedbackmanagementsystem.dto.Course;

public interface ICourseService {

	void deleteCourse(int id);

	Course addCourse(Course course);

	List<Course> getAllCourse();

	Course updateCourse(Course course);

	Course getCourseDetails(int id);

}

package com.cg.iter.feedbackmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.feedbackmanagementsystem.dao.CourseDao;
import com.cg.iter.feedbackmanagementsystem.dto.Course;

@Service
public class CourseService implements ICourseService {

	@Autowired
	private CourseDao courseDao;

	@Override
	public Course addCourse(Course course) {
		return courseDao.save(course);

	}
	@Override
	public void deleteCourse(int id) {
		courseDao.deleteById(id);

	}
	@Override
	public List<Course> getAllCourse() {
		return courseDao.findAll();

	}
	@Override
	public Course getCourseDetails(int id) {
		return courseDao.getOne(id);

	}
	@Override
	public Course updateCourse(Course course) {
		return courseDao.save(course);
		
	}

}

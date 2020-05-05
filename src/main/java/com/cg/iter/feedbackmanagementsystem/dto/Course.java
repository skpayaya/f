package com.cg.iter.feedbackmanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses_Spring")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	
	private String courseName;

	
	private int courseCharges;

	public Course() {
		super();
	}

	



	public Course(int courseId, String courseName, int courseCharges) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCharges = courseCharges;
	}





	public Course(String courseName, int courseCharges) {
		super();
		this.courseName = courseName;
		this.courseCharges = courseCharges;
	}





	public int getCourseId() {
		return courseId;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseCharges() {
		return courseCharges;
	}

	public void setCourseCharges(int courseCharges) {
		this.courseCharges = courseCharges;
	}


	
	
}
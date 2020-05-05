package com.cg.iter.feedbackmanagementsystem.dto;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class TrainingProgram {

	@Id
	private String id;
	
	@ManyToOne
	private Course course;
	
	@OneToOne
	private Trainer trainer;
	
	private Date startDate;
	private Date endDate;
	public TrainingProgram() {
		super();
	}
	public TrainingProgram(String id, Course course, Trainer trainer, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.course = course;
		this.trainer = trainer;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	

}
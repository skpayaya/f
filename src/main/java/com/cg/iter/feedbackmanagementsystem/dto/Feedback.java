package com.cg.iter.feedbackmanagementsystem.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Feedback {
	@Id
	private int id;
	
	@ManyToOne
	private Student student;
	
	
	@ManyToOne
	private TrainingProgram trainingProgram;

	
	
	private String criteriaFifth;
	private String criteriaFirst;
	private String criteriaFourth;
	private String criteriaSecond;
	private String criteriaThird;
	

	public Feedback() {
		super();
	}

	public String getCriteriaFifth() {
		return criteriaFifth;
	}

	public String getCriteriaFirst() {
		return criteriaFirst;
	}

	public String getCriteriaFourth() {
		return criteriaFourth;
	}
	public String getCriteriaSecond() {
		return criteriaSecond;
	}
	


	public String getCriteriaThird() {
		return criteriaThird;
	}
	public int getId() {
		return id;
	}


	public Student getStudent() {
		return student;
	}


	public TrainingProgram getTrainingProgram() {
		return trainingProgram;
	}


	public void setCriteriaFifth(String criteriaFifth) {
		this.criteriaFifth = criteriaFifth;
	}


	public void setCriteriaFirst(String criteriaFirst) {
		this.criteriaFirst = criteriaFirst;
	}


	public void setCriteriaFourth(String criteriaFourth) {
		this.criteriaFourth = criteriaFourth;
	}


	public void setCriteriaSecond(String criteriaSecond) {
		this.criteriaSecond = criteriaSecond;
	}


	public void setCriteriaThird(String criteriaThird) {
		this.criteriaThird = criteriaThird;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public void setTrainingProgram(TrainingProgram trainingProgram) {
		this.trainingProgram = trainingProgram;
	}


	
}

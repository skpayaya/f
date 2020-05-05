package com.cg.iter.feedbackmanagementsystem.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trainer_Spring")
public class Trainer {

	public Trainer() {
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trainerId;

	private String trainerName;

	@ElementCollection
	private Set<String> skill=new HashSet<>();

	
	public Trainer(String trainerName, Set<String> skill) {
		super();
		this.trainerName = trainerName;
		this.skill = skill;
	}


	public Trainer(int trainerId, String trainerName, Set<String> skill) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.skill = skill;
	}


	public int getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}


	public String getTrainerName() {
		return trainerName;
	}


	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}


	public void setSkills(Set<String> skills) {
		this.skill=skills;
		Set<String> skilledSet=new HashSet<>();
		skilledSet.addAll(skills);
	}

	public Set<String> getSkill() {
		return skill;
	}

	public void setSkill(Set<String> skill) {
		this.skill = skill;
	}




}
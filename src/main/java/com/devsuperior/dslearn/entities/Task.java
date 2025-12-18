package com.devsuperior.dslearn.entities;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_task")
public class Task extends Lesson implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String description;
	private Integer questionCount;
	private Integer approvalCount;
	private Double weight;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant dueDate;
	
	public Task() {
	}

	public Task(Long id, String title, Integer position, Section section, String decription, Integer questionCount,
			Integer approvalCount, Double weight, Instant dueDate) {
		super(id, title, position, section);
		this.description = decription;
		this.questionCount = questionCount;
		this.approvalCount = approvalCount;
		this.weight = weight;
		this.dueDate = dueDate;
	}

	public String getDecription() {
		return description;
	}

	public void setDecription(String decription) {
		this.description = decription;
	}

	public Integer getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

	public Integer getApprovalCount() {
		return approvalCount;
	}

	public void setApprovalCount(Integer approvalCount) {
		this.approvalCount = approvalCount;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Instant getDueDate() {
		return dueDate;
	}

	public void setDueDate(Instant dueDate) {
		this.dueDate = dueDate;
	}
	
	
	

}

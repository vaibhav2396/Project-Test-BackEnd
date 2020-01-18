package com.cdac.irp.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectId;

	private String subjectName;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;

	@OneToMany(mappedBy = "subject")
	private List<Question> questions = new ArrayList<Question>();

	public Subject() {
		System.out.println("in subject pojo");
	}

	public Subject(Integer subjectId, String subjectName, Course course, List<Question> questions) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.course = course;
		this.questions = questions;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}

package com.notifs.momEye.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_students")
public class StudentEntity extends UserEntity {
	
	private String department;
	private String course;
	private int year;
	@OneToMany(cascade = CascadeType.MERGE)
	private Set<SubjectEntity> subject;
	
	public StudentEntity() {}

	public StudentEntity(String department, String course, int year, Set<SubjectEntity> subject) {
		super();
		this.department = department;
		this.course = course;
		this.year = year;
		this.subject = subject;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Set<SubjectEntity> getSubject() {
		return subject;
	}

	public void setSubject(Set<SubjectEntity> subject) {
		this.subject = subject;
	}
	


}
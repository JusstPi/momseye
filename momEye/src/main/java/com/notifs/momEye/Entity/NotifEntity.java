package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_notif")
public class NotifEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fname;
	private 
	private String date;
	private String time;

	@OneToMany(cascade = CascadeType.MERGE)
	private Set<CourseEntity> course;
	
	public StudentEntity(int id, String firstname, String lastname, String program, int yearlevel,
			Set<CourseEntity> course) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.program = program;
		this.yearlevel = yearlevel;
		this.course = course;
	}

	public Set<CourseEntity> getCourse() {
		return course;
	}

	public void setCourse(Set<CourseEntity> course) {
		this.course = course;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public StudentEntity() {}
	
	public StudentEntity(int id, String firstname, String lastname, String program, int yearlevel) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.program = program;
		this.yearlevel = yearlevel;
	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYearlevel() {
		return yearlevel;
	}

	public void setYearlevel(int yearlevel) {
		this.yearlevel = yearlevel;
	}	
	
}
}

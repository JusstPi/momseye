package com.notifs.momEye.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.notifs.momEye.Entity.*;

public class SchoolEntity {

	 //define data member
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String firstname;
    private String lastname;
    private String program;
    private int yearlevel;
    
    @OneToMany(cascade = CascadeType.MERGE)
    private Set<CourseEntity> subject;
    
    public StudentEntity() {}
    //define constructor

	public StudentEntity(int id, String firstname, String lastname, String program, int yearlevel,
			Set<CourseEntity> subject) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.program = program;
		this.yearlevel = yearlevel;
		this.subject = subject;
	}
}

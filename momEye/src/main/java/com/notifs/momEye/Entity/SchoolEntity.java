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
    
    public SchoolEntity() {
    	//default
    }
    
	public SchoolEntity(int id, String firstname, String lastname, String program, int yearlevel) {
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

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_school")
public class SchoolEntity {
    

    
    //define data member
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String schoolName;
    private String schoolAddress;
    private String schoolCont;
 
    
  
    
    public SchoolEntity() {}
    //define constructor

	public SchoolEntity(int id, String schoolName, String schoolAddress, String schoolCont) {
		super();
		this.id = id;
		this.schoolName=schoolName;
		this.schoolAddress = schoolAddress;
		
		this.schoolCont = schoolCont;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolCont() {
		return schoolCont;
	}

	public void setSchoolCont(String schoolCont) {
		this.schoolCont = schoolCont;
	}



	
    
}
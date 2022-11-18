package com.notifs.momEye.Entity;




import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.notifs.momEye.Entity.*;

public class SchoolEntity {

	 //define data member
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schoolid;
    private String schoolName;
    private String schoolAddress;
   
    
    
    public SchoolEntity() {}
    //define constructor

	public SchoolEntity(int schoolid, String schoolName, String schoolAddress) {
		super();
		this.schoolid = schoolid;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
	
	}

	public int getSchoolid() {
		return schoolid;
	}

	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
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
	
}

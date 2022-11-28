package com.notifs.momEye.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_parents")
public class ParentEntity extends UserEntity{
	
	private String occupation;
	
	public ParentEntity() {}

	public ParentEntity(int userid, String username, String password, String fname, String mname, String lname, int age,
			String address, LocalDate bdate, int contactnum, String gender, String acctype, String occupation) {
		super(userid, username, password, fname, mname, lname, age, address, bdate, contactnum, gender, acctype);
		this.occupation = occupation;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
}

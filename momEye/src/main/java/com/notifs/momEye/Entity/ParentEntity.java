package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_parent")
public class ParentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int userid;
	private String username;
	private String password;
	private String fname;
	private String mname;
	private String lname;
	private int age;
	private String address;
	private String bdate;
	private int contactnum;
	private String acctype;
	private String occupation;
	
	public ParentEntity() {}
	
	public ParentEntity(int userid, String username, String password, String fname, String mname, String lname, int age,
			String address, String bdate, int contactnum, String acctype, String occupation) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.age = age;
		this.address = address;
		this.bdate = bdate;
		this.contactnum = contactnum;
		this.acctype = acctype;
		this.occupation = occupation;
	}

	//setters
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	
	public void setContactnum(int contactnum) {
		this.contactnum = contactnum;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	//getters
	public int getUserid() {
		return userid;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getMname() {
		return mname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getBdate() {
		return bdate;
	}
	
	public int getContactnum() {
		return contactnum;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
}
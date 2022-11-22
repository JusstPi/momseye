package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Student")
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int userid;
	private String username;
	private String password;
	private String fname;
	private String mname;
	private String lname;
	private int age;
	private String address;
	private String bdate;
	private int contactnum;
	private char acctype;
	private String department;
	private String course;
	private int year;
	
	public StudentEntity() {}

	public StudentEntity(int userid, String username, String password, String fname, String mname, String lname,
			int age, String address, String bdate, int contactnum, char acctype, String department, String course,
			int year) {
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
		this.department = department;
		this.course = course;
		this.year = year;
	}

	public int getUserid() {
		return userid;
	}

	/*public void setUserid(int userid) {
		this.userid = userid;
	}*/

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getContactnum() {
		return contactnum;
	}

	public void setContactnum(int contactnum) {
		this.contactnum = contactnum;
	}

	public char getAcctype() {
		return acctype;
	}

	public void setAcctype(char acctype) {
		this.acctype = acctype;
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
	
	
}
	
	
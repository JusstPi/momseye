package com.notifs.momEye.Entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tbl_users")
public class UserEntity {
	
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
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate bdate;
	
	private int contactnum;
	private String gender;
	private String acctype;;
	
	public UserEntity() {}
	
	public UserEntity(int userid, String username, String password, String fname, String mname, String lname,
			int age, String address, LocalDate bdate, int contactnum, String gender,String acctype) {
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
		this.gender = gender;
		this.acctype = acctype;
	}

	public int getUserid() {
		return userid;
	}

	public String getUsername() {
		return username;
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

	public String getMname() {
		return mname;
	}

	public String getLname() {
		return lname;
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

	public LocalDate getBdate() {
		return bdate;
	}

	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}

	public int getContactnum() {
		return contactnum;
	}

	public void setContactnum(int contactnum) {
		this.contactnum = contactnum;
	}
	
	public String getGender() {
		return gender;
	}

	public String getAcctype() {
		return acctype;
	}
}


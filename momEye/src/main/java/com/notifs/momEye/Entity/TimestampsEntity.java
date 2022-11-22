package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_timestamps")
public class TimestampsEntity {
	
	//Ephraim Khirt O. Perez BSIT-3/G1
	
	//define the data members
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String date;
	private String time;
	private String studentuser;

	
	public TimestampsEntity() {
		
	}


	public TimestampsEntity(int id, String date, String time, String studentuser) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.studentuser = studentuser;
	}


	public int getId() {
		return id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getStudentuser() {
		return studentuser;
	}


	public void setStudentuser(String studentuser) {
		this.studentuser = studentuser;
	}

	
}
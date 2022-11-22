package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_monitoredstudents")
public class MonitoredStudentsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String pusername;
	private String susername;
	private boolean status;
	
	public MonitoredStudentsEntity() {}
	
	public MonitoredStudentsEntity(int id, String pusername, String susername, boolean status) {
		super();
		this.id = id;
		this.pusername = pusername;
		this.susername = susername;
		this.status = status;
	}

	//setters
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//getters
	public int getId() {
		return id;
	}
	
	public String getPusername() {
		return pusername;
	}
	
	public String getSusername() {
		return susername;
	}
	
	public boolean getStatus() {
		return status;
	}
	
}


package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_notif")

public class NotifEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
<<<<<<< Updated upstream
	private int notifyId;
	private String template;
	private String descript;
	private boolean status;
	
	public NotifEntity() {
		//default
	}
	
	public NotifEntity(int notifyId, String template,  String descript, boolean status) {
=======
	public NotifEntity() {
		//default
	}
	public NotifEntity(int id, String studentUser, String date, String time) {
>>>>>>> Stashed changes
		super();
		this.notifyId = notifyId;
		this.template = template;
		this.descript = descript;
		this.status = status;
	}

	public int getNotifyId() {
		return notifyId;
	}

	public void setNotifyId(int notifyId) {
		this.notifyId = notifyId;
	}
	
	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}


	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
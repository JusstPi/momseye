package com.notifs.momEye.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_notif")
public class NotifEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int notifyId;
	
	private String descript;
	private String template;
	private boolean status;
	
	@OneToMany(cascade = CascadeType.MERGE)
	public Set<WatchlistEntity> watchlist_id;
	
	
	//@ManyToOne(cascade = CascadeType.MERGE)
	//public Set<StudentEntity> sender;
	
	//@OneToMany(cascade = CascadeType.MERGE)
	//public Set<WatchlistEntity> createdDate;
	
	public NotifEntity() {
		//default constructor
	}
	
		
	public NotifEntity(int notifyId, String descript, String template, boolean status,
			Set<WatchlistEntity> watchlist_id) {
		super();
		this.notifyId = notifyId;
		this.descript = descript;
		this.template = template;
		this.status = status;
		this.watchlist_id = watchlist_id;
		//this.sender = sender;
		//this.createdDate = createdDate;
	}


	public int getNotifyId() {
		return notifyId;
	}

	//public void setNotifyId(int notifyId) {
	//	this.notifyId = notifyId;
	//}


	public String getDescript() {
		return descript;
	}


	public void setDescript(String descript) {
		this.descript = descript;
	}


	public String getTemplate() {
		return template;
	}


	public void setTemplate(String template) {
		this.template = template;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Set<WatchlistEntity> getWatchlist_id() {
		return watchlist_id;
	}


	public void setWatchlist_id(Set<WatchlistEntity> watchlist_id) {
		this.watchlist_id = watchlist_id;
	}
	
	
}

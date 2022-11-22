package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_wathclist")

public class WatchlistEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int watchlist_id;
	
	private String wathclist_name;
	private String createdDate;
	
	public WatchlistEntity() {
		//default constructor
	}
	
	public WatchlistEntity(int watchlist_id, String wathclist_name, String createdDate) {
		super();
		this.watchlist_id = watchlist_id;
		this.wathclist_name = wathclist_name;
		this.createdDate = createdDate;
	}
	public int getWatchlist_id() {
		return watchlist_id;
	}
	public void setWatchlist_id(int watchlist_id) {
		this.watchlist_id = watchlist_id;
	}
	public String getWathclist_name() {
		return wathclist_name;
	}
	public void setWathclist_name(String wathclist_name) {
		this.wathclist_name = wathclist_name;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	
	
	

}

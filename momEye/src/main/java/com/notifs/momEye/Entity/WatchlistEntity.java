package com.notifs.momEye.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_watchlist")

public class WatchlistEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int watchlist_id;
	
	private String watchlistname;
	private String createdDate;
	
	public WatchlistEntity() {
		//default constructor
	}

	public WatchlistEntity(int watchlist_id, String watchlistname, String createdDate) {
		super();
		this.watchlist_id = watchlist_id;
		this.watchlistname = watchlistname;
		this.createdDate = createdDate;
	}

	public int getWatchlist_id() {
		return watchlist_id;
	}

	//public void setWatchlist_id(int watchlist_id) {
	//	this.watchlist_id = watchlist_id;
	//}

	public String getWatchlistname() {
		return watchlistname;
	}

	public void setWatchlistname(String watchlistname) {
		this.watchlistname = watchlistname;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	

}

package com.notifs.momEye.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
	private LocalDateTime createdDate=LocalDateTime.now();
	
	public WatchlistEntity() {
		//default constructor
	}

	public WatchlistEntity(int watchlist_id, String watchlistname, LocalDateTime createdDate) {
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

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	

}

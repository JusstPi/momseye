package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifs.momEye.Entity.WatchlistEntity;
import com.notifs.momEye.Repository.WatchlistRepository;

@Service
public class WatchlistService {
	
	@Autowired
	WatchlistRepository wrepo;
	
	//C - Create or insert record
	public WatchlistEntity insertWatchlist(WatchlistEntity watchlist) {
		return wrepo.save(watchlist);
	}
	
	//R - Read all records from tbl_watchlist
	public List<WatchlistEntity> getAllWatchlist(){
		return wrepo.findAll();
	}
		
	//R - Read or search record by watchlistName
	public WatchlistEntity findByWatchlistname(String watchlistname) {
		if (wrepo.findByWatchlistname(watchlistname) != null)
			return wrepo.findByWatchlistname(watchlistname);
		else 
			return null;
	}
		
	//U - Update a record 
	public WatchlistEntity putWatchlist(int watchlist_id, WatchlistEntity newDetails) throws Exception{

		WatchlistEntity watchlist = new WatchlistEntity();

	       try {
	           //Step 1 - search the id number of the student
	    	   watchlist = wrepo.findById(watchlist_id).get(); //findById() is a pre-defined 

	           //Step 2 - update the record
	    	   watchlist.setWatchlistname(newDetails.getWatchlistname());
	    	   watchlist.setCreatedDate(newDetails.getCreatedDate());

	           //Step 3 - save the information and return the value
	           return wrepo.save(watchlist);

	       } catch(NoSuchElementException next) {
	           throw new Exception("ID Number " +watchlist_id+ "does not exist!");
	       }
	   }
		
		
	//D - Delete record
	public String deleteWatchlist(int watchlist_id){
		String msg;
		if(wrepo.findById(watchlist_id) != null) {	//Step 1 - find the record
			wrepo.deleteById(watchlist_id);			//Step 2 - delete the record
				
			msg = "Watchlist ID Number " +watchlist_id+ " is successfully deleted!";
		}
		else
			msg = "Watchlist ID Number " +watchlist_id+ " is NOT found!";
			
		return msg;
	}
		
}


package com.notifs.momEye.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.notifs.momEye.Entity.WatchlistEntity;
import com.notifs.momEye.Service.WatchlistService;

@RestController
@RequestMapping("/watchlist")
@CrossOrigin
public class WatchlistController {
	
	@Autowired
	WatchlistService wserv;
	
	//printHelloStudent
			@GetMapping("/print")
			public String printWatchlist() {
				return "Hello, Parent this is your list of students!";
			}
			
			//Create or insert a student record
			@PostMapping("/postWatchlist")
			public WatchlistEntity insertWatchlist(@RequestBody WatchlistEntity watchlist) {
				return wserv.insertWatchlist(watchlist);
			}
			
			//Read all records
			@GetMapping("/getAllWatchlist")
			public List<WatchlistEntity> getAllWatchlist(){
				return wserv.getAllWatchlist();
			}
			
			@GetMapping("/getByWatchlistName")
		    public WatchlistEntity findByWatchlistname(@RequestParam String watchlistname) {
		        return wserv.findByWatchlistname(watchlistname);
		    }
			
			//Update a record
			@PutMapping("/putWatchlist")
			public WatchlistEntity putWatchlist(@RequestParam int watchlist_id, @RequestBody WatchlistEntity newDetails) throws Exception{
				return wserv.putWatchlist(watchlist_id, newDetails);
			}
			
			//Delete a record
			@DeleteMapping("/deleteWatchlist/{watchlist_id}")
			public String deleteWatchlist(@PathVariable int watchlist_id) {
					return wserv.deleteWatchlist(watchlist_id);
			}

}

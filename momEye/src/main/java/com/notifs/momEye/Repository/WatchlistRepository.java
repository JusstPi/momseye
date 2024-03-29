package com.notifs.momEye.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notifs.momEye.Entity.WatchlistEntity;

@Repository
public interface WatchlistRepository extends JpaRepository<WatchlistEntity, Integer>{
	
	WatchlistEntity findByWatchlistname(String watchlistname);

}

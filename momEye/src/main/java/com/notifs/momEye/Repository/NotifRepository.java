package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifRepository extends JpaRepository<NotifRepository, Integer>{
	
	//user-defined query 
	NotifRepository findById(String id);
}
package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notifs.momEye.Entity.NotifEntity;

@Repository
public interface NotifRepository extends JpaRepository<NotifRepository, Integer>{
	
	//user-defined query 
	NotifEntity findById(int id);
}
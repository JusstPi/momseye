package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notifs.momEye.Entity.SchoolEntity;

@Repository
public interface SchoolRepository extends JpaRepository<SchoolEntity, Integer>{
	
	//user-defined query
	

}
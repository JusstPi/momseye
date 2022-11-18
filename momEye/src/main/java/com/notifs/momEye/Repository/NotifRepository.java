package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.notifs.momEye.Entity.NotifEntity;

@Repository
public interface NotifRepository extends JpaRepository<NotifEntity, Integer>{
	
	//PK = id
	//Wrapper class = Integer
	
	//user-defined query 

	NotifEntity findByStudentUser(String studentUser);
}
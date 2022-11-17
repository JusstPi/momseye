package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifRepository extends JpaRepository<NotifRepository, Integer>{

	//the Wrapper class counterpart of the data type of the PK of the Entity
	
	//PK = id
	//data type of id = int
	//Wrapper class = Integer
	
	//user-defined query 
	NotifRepository findByid(String id);
}
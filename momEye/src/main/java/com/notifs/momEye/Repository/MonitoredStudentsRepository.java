package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notifs.momEye.Entity.MonitoredStudentsEntity;

@Repository
public interface MonitoredStudentsRepository extends JpaRepository<MonitoredStudentsEntity, Integer> {
	
	//user-define query
	MonitoredStudentsEntity fingById(int id);
}

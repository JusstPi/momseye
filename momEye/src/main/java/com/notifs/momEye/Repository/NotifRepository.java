package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.notifs.momEye.Entity.NotifEntity;

@Repository
public interface NotifRepository extends JpaRepository<NotifEntity, Integer>{
	//user-defined query 

	NotifEntity findByTemplate(String template);

	//NotifEntity findByNotifyId(int notifyId);
}
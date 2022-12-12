package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notifs.momEye.Entity.SubjectEntity;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity, Integer>{
	
	//user-defined query
	SubjectEntity findByCode(String code);
}
package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notifs.momEye.Entity.ParentEntity;


@Repository
public interface ParentRepository extends JpaRepository<ParentEntity, Integer>{
	//user defined query
}

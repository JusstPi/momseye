package com.notifs.momEye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notifs.momEye.Entity.TimestampsEntity;


@Repository
public interface TimestampsRepository extends JpaRepository<TimestampsEntity, Integer> {

}

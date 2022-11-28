package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifs.momEye.Entity.ParentEntity;
import com.notifs.momEye.Repository.ParentRepository;


@Service
public class ParentService {
	
	//this class contains all the business logic of your system (CRUD)
	
	@Autowired
	ParentRepository prepo;
	
	//C - create or insert an occupation
	public ParentEntity insertParent(ParentEntity parent) {
		return prepo.save(parent);
	}
	
	//R - read all record from tbl_parents
	public List<ParentEntity> getAllParents() {
		return prepo.findAll();
	}
	
	//U - update parent record
	public ParentEntity putParent(int userid, ParentEntity newParentDetails) throws Exception {
		ParentEntity parent = new ParentEntity();
		
		try {
			parent = prepo.findById(userid).get();
			
			parent.setOccupation(newParentDetails.getOccupation());
			
			return prepo.save(parent);
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + userid + " does not exist!");
		}
	}
}

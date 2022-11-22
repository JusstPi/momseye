package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifs.momEye.Entity.ParentEntity;
import com.notifs.momEye.Repository.ParentRepository;

@Service
public class ParentService {
	
	@Autowired
	ParentRepository srepo;
	
	//C - Create or insert a student record
	public ParentEntity insertParent(ParentEntity parent) {
		return srepo.save(parent);
	}
	
	//R - Read all records from tbl_parent
	public List<ParentEntity> getAllParents() {
		return srepo.findAll();
	}
	
	//R - Read or search student record by username
	public ParentEntity findByUsername(String username) {
		if (srepo.findByUsername(username) != null)
			return srepo.findByUsername(username);
		else 
			return null;
	}
	
	//U - Update a student record
	public ParentEntity putParent(int userid, ParentEntity newParentDetails) throws Exception {
		ParentEntity parent = new ParentEntity();
		
		try {
			//steps in updating
			//Step 1 - search the username of the parent
			parent = srepo.findById(userid).get();
			
			//Step 2 - update the record
			parent.setPassword(newParentDetails.getPassword());
			parent.setAge(newParentDetails.getAge());
			parent.setAddress(newParentDetails.getAddress());
			parent.setBdate(newParentDetails.getBdate());
			parent.setContactnum(newParentDetails.getContactnum());
			parent.setOccupation(newParentDetails.getOccupation());
			
			//Step 3 - save the information and return the value
			return srepo.save(parent);
		}catch(NoSuchElementException nex) {
			throw new Exception("User ID " + userid + " does not exist!");
		}
	}
	
	
	//D - Delete parent record
	public String deleteParent(int userid) {
		String msg;
		if (srepo.findById(userid) != null) {  //Step 1 = find the record
			srepo.deleteById(userid);		   //Step 2 = delete the record
			
			msg = "Student ID Number " + userid + " is successfully deleted!";
		}
		else
			msg = "Student ID Number " + userid + " is NOT found!";
		
		return msg;
	}
}


package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifs.momEye.Entity.UserEntity;
import com.notifs.momEye.Repository.UserRepository;

@Service
public class UserService {
	
	//this class contains all the business logic of your system (CRUD)
	
	@Autowired
	UserRepository srepo;
	
	//C - Create or insert a user record
	public UserEntity insertUser(UserEntity user) {
		return srepo.save(user);
	}
	
	//R - Read all records from tbl_user
	public List<UserEntity> getAllUsers() {
		return srepo.findAll();
	}
	
	//R - Read or search user record by username
	public UserEntity findByUsername(String username) {
		if (srepo.findByUsername(username) != null)
			return srepo.findByUsername(username);
		else 
			return null;
	}
	
	//U - Update a user record
	public UserEntity putUser(int userid, UserEntity newUserDetails) throws Exception {
		UserEntity user = new UserEntity();
		
		try {
			//steps in updating
			//Step 1 - search the id number of the user
			user = srepo.findById(userid).get(); //findById() is a pre-defined method
			
			//Step 2 - update the record
			user.setPassword(newUserDetails.getPassword());
			user.setAge(newUserDetails.getAge());
			user.setAddress(newUserDetails.getAddress());
			user.setBdate(newUserDetails.getBdate());
			user.setContactnum(newUserDetails.getContactnum());
			
			//Step 3 - save the information and return the value
			return srepo.save(user);
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + userid + " does not exist!");
		}
	}
	
	
	//D - Delete student record
	public String deleteUser(int userid) {
		String msg;
		if (srepo.findById(userid) != null) {  //Step 1 = find the record
			srepo.deleteById(userid);		   //Step 2 = delete the record
			
			msg = "User ID Number " + userid + " is successfully deleted!";
		}
		else
			msg = "User ID Number " + userid + " is NOT found!";
		
		return msg;
	}
}

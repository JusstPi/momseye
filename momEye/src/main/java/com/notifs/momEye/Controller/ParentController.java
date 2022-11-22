package com.notifs.momEye.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.notifs.momEye.Entity.ParentEntity;
import com.notifs.momEye.Service.ParentService;

@RestController
@RequestMapping("/parent")
public class ParentController {
	
	@Autowired
	ParentService stserv;
	
	
	//create or insert a student record
	@PostMapping("/postParent")
	public ParentEntity insertParent(@RequestBody ParentEntity parent) {
		return stserv.insertParent(parent);
	}
	
	//read all records
	@GetMapping("/getAllParents")
	public List<ParentEntity> getAllParents() {
		return stserv.getAllParents();
	}
	
	//read a record by username
	@GetMapping("/getByUsername")
	public ParentEntity findByUsername(@RequestParam String username) {
		return stserv.findByUsername(username);
	}
	
	//update a record
	@PutMapping("/putParent")
	public ParentEntity putStudent(@RequestParam int userid, @RequestBody ParentEntity newParentDetails) 
			throws Exception {
		return stserv.putParent(userid, newParentDetails);
	}
	
	//delete a record
	@DeleteMapping("/deleteParent/{userid}")
	public String deleteParent(@PathVariable int userid) {
		return stserv.deleteParent(userid);
	}
	
}

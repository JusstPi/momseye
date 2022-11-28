package com.notifs.momEye.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@CrossOrigin
public class ParentController {
	
	@Autowired
	ParentService pserv;
	
	//create or insert a parent record
	@PostMapping("/postParent")
	public ParentEntity insertParent(@RequestBody ParentEntity parent) {
		return pserv.insertParent(parent);
	}
	
	//read all records
	@GetMapping("/getAllParents")
	public List<ParentEntity> getAllParents() {
		return pserv.getAllParents();
	}
	
	//update a record
	@PutMapping("/putUser")
	public ParentEntity putParent(@RequestParam int userid, @RequestBody ParentEntity newParentDetails) 
			throws Exception {
		return pserv.putParent(userid, newParentDetails);
	}
}

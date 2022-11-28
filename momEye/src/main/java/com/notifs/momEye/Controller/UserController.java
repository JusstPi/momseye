package com.notifs.momEye.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.notifs.momEye.Entity.UserEntity;
import com.notifs.momEye.Service.UserService;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService stserv;
	
	//print hello
	@GetMapping("/print")
	public String printHelloStudent() {
		return "Hello, User!";
	}
	
	//create or insert a user record
	@PostMapping("/postUser")
	public UserEntity insertUser(@RequestBody UserEntity user) {
		return stserv.insertUser(user);
	}
	
	//read all records
	@GetMapping("/getAllUsers")
	public List<UserEntity> getAllUsers() {
		return stserv.getAllUsers();
	}
	
	//read a record by username
	@GetMapping("/getByUsername")
	public UserEntity findByUsername(@RequestParam String username) {
		return stserv.findByUsername(username);
	}
	
	//update a record
	@PutMapping("/putUser")
	public UserEntity putUser(@RequestParam int userid, @RequestBody UserEntity newUserDetails) 
			throws Exception {
		return stserv.putUser(userid, newUserDetails);
	}
	
	//delete a record
	@DeleteMapping("/deleteUser/{userid}")
	public String deletUser(@PathVariable int userid) {
		return stserv.deleteUser(userid);
	}
	
}

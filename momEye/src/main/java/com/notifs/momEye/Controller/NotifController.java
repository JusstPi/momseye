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

import com.notifs.momEye.Entity.NotifEntity;
import com.notifs.momEye.Service.NotifService;

@RestController
@RequestMapping("/notification")
public class NotifController {

	@Autowired
	NotifService ntserv;
	
	//printHelloStudent
	@GetMapping("/print")
	public String printNotif() {
		return "Hello, Parent/Student!";
	}
	
	//Create or insert a student record
	@PostMapping("/postNotif")
	public NotifEntity insertNotif(@RequestBody NotifEntity notif) {
		return ntserv.insertNotif(notif);
	}
	
	//Read all records
	@GetMapping("/getNotif")
	public List<NotifEntity> getAllNotif(){
		return ntserv.getAllNotif();
	}
	
	//Update a record
	@PutMapping("/putNotif")
	public NotifEntity putNotif(@RequestParam int id, @RequestBody NotifEntity newNotif) throws Exception{
		return ntserv.putNotif(id, newNotif);
	}
	
	//Delete a record
	@DeleteMapping("/deleteNotif/{id}")
	public String deleteNotif(@PathVariable int id) {
			return ntserv.deleteNotif(id);
	}
} 


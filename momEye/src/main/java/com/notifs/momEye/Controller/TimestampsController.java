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

import com.notifs.momEye.Entity.TimestampsEntity;
import com.notifs.momEye.Service.TimestampsService;



@RestController
@RequestMapping("/timestamps")
public class TimestampsController {
	
	//Ephraim Khirt O. Perez BSIT-3/G1
	@Autowired
	TimestampsService tsserv;
	
	
	//Create or Insert a student record
	@PostMapping("/postTimestamps")
	public TimestampsEntity insertTimestamps(@RequestBody TimestampsEntity timestamps) {
		return tsserv.insertTimestamps(timestamps);
	}
	
	//Read all records
	@GetMapping("/getAllTimestamps")
	public List<TimestampsEntity> getAllTimestamps(){
		return tsserv.getAllTimestamps();
	}
	
	
	//Update a record
	@PutMapping("/putTimestamps")
	public TimestampsEntity putTimestamps(@RequestParam int id, @RequestBody TimestampsEntity newTimestampstDetails) throws Exception{
		return tsserv.putTimestamps(id, newTimestampstDetails );
	}
	
	//Delete a record
	@DeleteMapping("/deleteTimestamps/{id}")
	public String deleteTimestamps(@PathVariable int id) {
		return tsserv.deleteTimestamps(id);
		
	}
	
}


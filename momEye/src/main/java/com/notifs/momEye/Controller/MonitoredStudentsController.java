package com.notifs.momEye.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.notifs.momEye.Entity.MonitoredStudentsEntity;
import com.notifs.momEye.Service.MonitoredStudentsService;

@RestController
@RequestMapping("/parent")
public class MonitoredStudentsController {
	
	@Autowired
	MonitoredStudentsService stserv;
	
	
	//create or insert a student record
	@PostMapping("/postMonitoredStudent")
	public MonitoredStudentsEntity insertMonitoredStudent(@RequestBody MonitoredStudentsEntity mstudent) {
		return stserv.insertMonitoredStudent(mstudent);
	}
	
	//read all records
	@GetMapping("/getAllMonitoredStudents")
	public List<MonitoredStudentsEntity> getAllMonitoredStudents() {
		return stserv.getAllMonitoredStudents();
	}
	
	//update a record
	@PutMapping("/putMonitoredStudent")
	public MonitoredStudentsEntity putMonitoredStudent(@RequestParam int id, @RequestBody MonitoredStudentsEntity newMonitoredStudentDetails) 
			throws Exception {
		return stserv.putMonitoredStudent(id, newMonitoredStudentDetails);
	}
}


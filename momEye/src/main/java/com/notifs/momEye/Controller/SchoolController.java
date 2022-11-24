package com.notifs.momEye.Controller;
import com.notifs.momEye.Entity.*;
import com.notifs.momEye.Service.SchoolService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



public class SchoolController {
	@Autowired
	SchoolService stserv;
	
	//printHelloStudent
	@GetMapping("/print")
	public String printHelloStudent() {
		return "Hello, Student!";
	}
	
	
	//Create or insert a student record
	@PostMapping("/postStudent")
	public SchoolEntity insertStudent(@RequestBody SchoolEntity school) {
		return stserv.insertStudent(school);
	} 
	
	
	//Read all records
	@GetMapping("/getAllSchool")
	public List<SchoolEntity> getAllStudents(){
		return stserv.getAllSchool();
	}

//	//Read a record by Firstname
//	@GetMapping("/getByfirstname")
//	public SchoolEntity findByFirstname(@RequestParam String firstname) {
//		return stserv.findByFirstname(firstname);
//	}
	
	@PutMapping("/updateSchool")
    public SchoolEntity putStudent(@RequestParam int id, @RequestBody SchoolEntity newStudentDetails) throws Exception{
        return stserv.putSchool(id, newStudentDetails);

        }

    //delete a record
    @DeleteMapping("/deleteSchool/{id}")
    public String deleteStudent(@PathVariable int id){ 
        return stserv.deleteStudent(id);
    }
}

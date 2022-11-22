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

import com.notifs.momEye.Entity.SchoolEntity;

import com.notifs.momEye.Service.SchoolService;


@RestController
@RequestMapping("/school")
public class SchoolController {
	
	@Autowired
	SchoolService scserv;
	
	//printHelloStudent
	@GetMapping("/printSchool")
	public String printHelloSchool() {
		return "Hello, World";
	}
	
	
	
	//Create or insert a student record
	@PostMapping("/postSchool")
	public SchoolEntity insertSchool(@RequestBody SchoolEntity student) {
		return scserv.insertSchool(student);
	} 
	
	
	//Read all records
	@GetMapping("/getAllSchool")
	public List<SchoolEntity> getAllSchool(){
		return scserv.getAllSchool();
	}

//	//Read a record by Firstname
//	@GetMapping("/getByfirstname")
//	public SchoolEntity findByFirstname(@RequestParam String firstname) {
//		return scserv.findByFirstname(firstname);
//	}
	
	@PutMapping("/updateSchool")
    public SchoolEntity putSchool(@RequestParam int id, @RequestBody SchoolEntity newStudentDetails) throws Exception{
        return scserv.putSchool(id, newStudentDetails);

        }

    //delete a record
    @DeleteMapping("/deleteSchool/{id}")
    public String deleteSchool(@PathVariable int id){ 
        return scserv.deleteSchool(id);
    }
	
}
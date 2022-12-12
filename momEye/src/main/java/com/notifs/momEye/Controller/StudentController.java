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

import com.notifs.momEye.Entity.StudentEntity;
import com.notifs.momEye.Service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	
	@Autowired
	StudentService stserv;
	
	//Create student
	@PostMapping("/postStudent")
	public StudentEntity insertStudent(@RequestBody StudentEntity student) {
		return stserv.insertStudent(student);
		
	//Get all students
	}
	@GetMapping("/getAllStudents")
	public List<StudentEntity> getAllStudent(){
		return stserv.getAllStudent();
	}
	
	//Update student
	@PutMapping("/putStudent")
     public StudentEntity putStudent(@RequestParam int userID,@RequestBody StudentEntity newStudentDetails) throws Exception{
         return stserv.putStudent(userID, newStudentDetails);
     }
}

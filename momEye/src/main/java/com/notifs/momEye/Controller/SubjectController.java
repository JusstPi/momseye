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

import com.notifs.momEye.Entity.SubjectEntity;
import com.notifs.momEye.Service.SubjectService;

@RestController
@RequestMapping("/subject")
@CrossOrigin
public class SubjectController {

	@Autowired
	SubjectService subserv;
	
	@PostMapping("/postSubject")
	public SubjectEntity insertSubject(@RequestBody SubjectEntity subject) {
		return subserv.insertSubject(subject);
	}
	
	@GetMapping("/getAllSubjects")
	public List<SubjectEntity> getAllSubjects() {
		return subserv.getAllSubjects();
	}
	
	@GetMapping("/getByCode")
	public SubjectEntity findByCode(@RequestParam String code) {
		return subserv.findByCode(code);
	}
	
	@PutMapping("/putSubject")
	public SubjectEntity putSubject(@RequestParam int subjectId, @RequestBody SubjectEntity newSubjectDetails) 
			throws Exception {
		return subserv.putSubject(subjectId, newSubjectDetails);
	}
	
	@DeleteMapping("/deleteSubject/{subjectId}")
	public String deleteSubject(@PathVariable int subjectId) {
		return subserv.deleteSubject(subjectId);
	}
	
}

package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifs.momEye.Entity.SubjectEntity;
import com.notifs.momEye.Repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	SubjectRepository subrepo;
	
	public SubjectEntity insertSubject(SubjectEntity subject) {
		return subrepo.save(subject);
	}
	
	public List<SubjectEntity> getAllSubjects(){
		return subrepo.findAll();
	}
	
	public SubjectEntity findByCode(String code) {
		if(subrepo.findByCode(code) != null)
			return subrepo.findByCode(code);
		else
			return null;
	}
	
	public SubjectEntity putSubject(int subjectId, SubjectEntity newSubjectDetails) throws Exception{
		SubjectEntity subject = new SubjectEntity();
		
		try {
			subject = subrepo.findById(subjectId).get();
			
			subject.setCode(newSubjectDetails.getCode());
			subject.setRoom(newSubjectDetails.getRoom());
			subject.setSubjectName(newSubjectDetails.getSubjectName());
			
			return subrepo.save(subject);
		}catch(NoSuchElementException nex){
			throw new Exception("SubjectId " + subjectId + "does not exist");
		}
	}
	
	public String deleteSubject(int subjectId) {
		String msg;
		
		if (subrepo.findById(subjectId) != null) {
			subrepo.deleteById(subjectId);
			
			msg = "Subject ID Number" + subjectId + "is successfully deleted";
		}
		else
			msg = "Subject ID Number" + subjectId + "is not found";
		
		return msg;
	}
	
	

}


package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifs.momEye.Entity.MonitoredStudentsEntity;
import com.notifs.momEye.Repository.MonitoredStudentsRepository;

@Service
public class MonitoredStudentsService {
	
	@Autowired
	MonitoredStudentsRepository srepo;
	
	//C - Create or insert a student record
	public MonitoredStudentsEntity insertMonitoredStudent(MonitoredStudentsEntity mstudent) {
		return srepo.save(mstudent);
	}
	
	//R - Read all records from tbl_parent
	public List<MonitoredStudentsEntity> getAllMonitoredStudents() {
		return srepo.findAll();
	}
	
	//U - Update a student record
	public MonitoredStudentsEntity putMonitoredStudent(int id, MonitoredStudentsEntity newMonitoredStudentDetails) throws Exception {
		MonitoredStudentsEntity mstudent = new MonitoredStudentsEntity();
		
		try {
			//steps in updating
			//Step 1 - search the username of the parent
			mstudent = srepo.findById(id).get();
			
			//Step 2 - update the record
			mstudent.setStatus(newMonitoredStudentDetails.getStatus());
			
			//Step 3 - save the information and return the value
			return srepo.save(mstudent);
		}catch(NoSuchElementException nex) {
			throw new Exception("User ID " + id + " does not exist!");
		}
	}
}

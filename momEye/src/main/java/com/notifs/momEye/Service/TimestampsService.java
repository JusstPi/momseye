package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.notifs.momEye.Entity.TimestampsEntity;
import com.notifs.momEye.Repository.TimestampsRepository;

public class TimestampsService {

	@Autowired
	TimestampsRepository tsrepo;
	
	//C - Create or Insert a timestamps record
	public TimestampsEntity insertTimestamps(TimestampsEntity timestamps) {
		return tsrepo.save(timestamps);
	}
	
	
	//R - Read all records from the table name tbl_timestamps
	public List<TimestampsEntity> getAllTimestamps(){
		return tsrepo.findAll();
	}
	
	//U- Update a timestamps record
	public TimestampsEntity putTimestamps(int id, TimestampsEntity newTimestampstDetails) throws Exception{
		
		TimestampsEntity timestamps = new TimestampsEntity();
		
		try {
			//steps in updating
			//step 1 - search the id number of the student
			timestamps = tsrepo.findById(id).get(); //findById() is a pre-defined method
			
			//step 2 - update the record 
			timestamps.setDate(newTimestampstDetails.getDate());
			timestamps.setTime(newTimestampstDetails.getTime());
			timestamps.setStudentuser(newTimestampstDetails.getStudentuser());
			
			//step 3 - save the information and return the value
			return tsrepo.save(timestamps);
			
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number "+id+ "does not exist!");
			
		}
	}
	
	//D - Delete student record 
	public String deleteTimestamps(int id) {
		String msg;
		if(tsrepo.findById(id) != null) { //step 1 - find the record 
			tsrepo.deleteById(id); //step 2 - delete the record
			
			msg ="Timestamps ID Number "+ id +" is successfully deleted!";
		}
		else
			msg ="Timestamps ID Number "+ id +" is NOT found!";
		
		return msg;
		
	}
}


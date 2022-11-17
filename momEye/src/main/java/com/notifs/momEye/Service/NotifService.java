package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifs.momEye.Entity.NotifEntity;
import com.notifs.momEye.Repository.NotifRepository;

@Service
public class NotifService {

	@Autowired
	NotifRepository nrepo;
	
	//C - Create or insert a record
	
	public NotifEntity insertNotif(NotifEntity notif) {
		return nrepo.save();
	}
	
	//R - Read all records
	public List<NotifEntity> getAllNotif(){
		return nrepo.findAll();
	}
	
	//U - Update record 
	public NotifEntity putNotif(int id, NotifEntity newNotif) throws Exception{
		
		NotifEntity notifs = new NotifEntity;
		
		try {
			notifs = nrepo.findById(id).get();
			
			//Step 2 - update the record
			notifs.setDate(newNotif.getDate());
			notifs.setTime(newNotif.getTime());
			
			//Step 3 - save the information and return the value
			return nrepo.save(notifs);

		} catch(NoSuchElementException nex) {
			throw new Exception("ID Number " +id+ "does not exist!");
		}
	}
	
	//D - Delete notification
	public String deleteNotif(int id){
		String msg;
		if(nrepo.findById(id) != null) {	
			nrepo.deleteById(id);
			
			msg = "Notification ID Number " +id+ " is successfully deleted!";
		}
		else
			msg = "Notification ID Number " +id+ " is NOT found!";
		
		return msg;
	}

}

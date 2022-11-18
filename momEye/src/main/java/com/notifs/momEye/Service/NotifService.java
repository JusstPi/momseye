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
	
	//C - Create or insert record
	public NotifEntity insertNotif(NotifEntity notif) {
		return nrepo.save(notif);
	}
	
	//R - Read all records from tbl_notif
	public List<NotifEntity> getAllNotif(){
		return nrepo.findAll();
	}
	
	//R - Read or search record by studentUser
	public NotifEntity findByStudentUser(String studentUser) {
		if (nrepo.findByStudentUser(studentUser) != null)
			return nrepo.findByStudentUser(studentUser);
		else 
			return null;
	}
	
	//U - Update a record 
	public NotifEntity putNotif(int id, NotifEntity newDetails) throws Exception{

        NotifEntity notifs = new NotifEntity();

        try {
            //Step 1 - search the id number of the student
            notifs = nrepo.findById(id).get(); //findById() is a pre-defined 

            //Step 2 - update the record
            notifs.setStudentUser(newDetails.getStudentUser());
            notifs.setDate(newDetails.getDate());
            notifs.setTime(newDetails.getTime());

            //Step 3 - save the information and return the value
            return nrepo.save(notifs);

        } catch(NoSuchElementException nex) {
            throw new Exception("ID Number " +id+ "does not exist!");
        }
    }
	
	
	//D - Delete record
	public String deleteNotif(int id){
		String msg;
		if(nrepo.findById(id) != null) {	//Step 1 - find the record
			nrepo.deleteById(id);			//Step 2 - delete the record
			
			msg = "Notification ID Number " +id+ " is successfully deleted!";
		}
		else
			msg = "Notification ID Number " +id+ " is NOT found!";
		
		return msg;
	}
	
}

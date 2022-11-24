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
	
	//R - Read a notif record from tbl_notif
	public List<NotifEntity> getAllNotif(){
		return nrepo.findAll();
	}
	
	//R - Read or search record by notifyId
	public NotifEntity findByNotifyId(int notifyId) {
		if (nrepo.findByNotifyId(notifyId) != null)
			return nrepo.findByNotifyId(notifyId);
		else 
			return null;
	}
	
	//U - Update a record 
	public NotifEntity putNotif(int notifyId, NotifEntity newDetails) throws Exception{

        NotifEntity notifs = new NotifEntity();

        try {
            //Step 1 - search the id number of the student
            notifs = nrepo.findById(notifyId).get(); //findById() is a pre-defined 

            //Step 2 - update the record
            notifs.setDescript(newDetails.getDescript());
            notifs.setTemplate(newDetails.getTemplate());
            notifs.setStatus(newDetails.isStatus());

            //Step 3 - save the information and return the value
            return nrepo.save(notifs);

        } catch(NoSuchElementException next) {
            throw new Exception("ID Number " +notifyId+ "does not exist!");
        }
    }
	
	//D - Delete record
	public String deleteNotif(int notifyId){
		String msg;
		if(nrepo.findById(notifyId) != null) {	//Step 1 - find the record
			nrepo.deleteById(notifyId);			//Step 2 - delete the record
			
			msg = "Notification ID Number " +notifyId+ " is successfully deleted!";
		}
		else
			msg = "Notification ID Number " +notifyId+ " is NOT found!";
		
		return msg;
	}
	
}
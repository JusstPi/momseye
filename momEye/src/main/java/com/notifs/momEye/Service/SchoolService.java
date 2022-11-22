package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notifs.momEye.Entity.SchoolEntity;
import com.notifs.momEye.Repository.SchoolRepository;

@Service
public class SchoolService {
	
	/* this class contains all the business logic of your system
	 * Create a student record
	 * Read Student record/s by id or Firstname
	 * Update a student record
	 * Delete a student
	 **/
	
	@Autowired
	SchoolRepository srepo;
	
	//C - Create or insert a student record
	public SchoolEntity insertSchool(SchoolEntity school) {
		return srepo.save(school);
	}
	
	
	
	//R - Read all records from tbl_student
	public List<SchoolEntity> getAllSchool(){
		return srepo.findAll();
	}
	
	
//	//R - Read or search student record by Firstname
//	public SchoolEntity findByFirstname(String firstname) {
//		if (srepo.findByFirstname(firstname) != null)
//			return srepo.findByFirstname(firstname);
//		else
//			return null;
//	}
	
	public SchoolEntity putSchool(int id, SchoolEntity newSchoolDetails) throws Exception{
		SchoolEntity school = new SchoolEntity();
        try {
        	school = srepo.findById(id).get();


        	school.setSchoolName(newSchoolDetails.getSchoolName());
        	school.setSchoolAddress(newSchoolDetails.getSchoolAddress());
        	school.setSchoolCont(newSchoolDetails.getSchoolCont());

            return srepo.save(school);


        }catch(NoSuchElementException nex) {
            throw new Exception("ID Number " + id + " does not exist!");
            }

    }


    //D - Delete student record
    public String deleteSchool(int id) {
        String msg;
        if(srepo.findById(id) !=null) {
            srepo.deleteById(id);

            msg = "School ID Number " + id + " is successfully deleted";
        }
        else 
            msg = "School ID Number " +id + " is NOT found!";

        return msg;
    }

}

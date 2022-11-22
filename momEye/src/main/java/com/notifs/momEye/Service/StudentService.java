package com.notifs.momEye.Service;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.notifs.momEye.Entity.StudentEntity;
import com.notifs.momEye.Repository.StudentRepository;

@Service
public class StudentService {
	
	/* this class contains all business logic of your system
	 * CREATE
	 * READ
	 * UPDATE
	 * DELETE
	 */
	
	@Autowired
	StudentRepository srepo;
	
	public StudentEntity insertStudent(StudentEntity student) {
		return srepo.save(student); 
 	}
	//Read record from the table named tbl_student
	public List<StudentEntity> getAllStudent(){
		return srepo.findAll();
	}
	
	public StudentEntity findByUsername(String username) {
		if(srepo.findByUsername(username) != null)
			return srepo.findByUsername(username);
		else
			return null;
	}
	
	public StudentEntity putStudent(int userid, StudentEntity newStudentDetails) throws Exception{
        StudentEntity student = new StudentEntity();

        try {
            //Step 1 search the userid number
            student = srepo.findById(userid).get(); //find by ID

            //Step 2 update record
            student.setPassword(newStudentDetails.getPassword());
            student.setAge(newStudentDetails.getAge());
            student.setAddress(newStudentDetails.getAddress());
            student.setBdate(newStudentDetails.getBdate());
            student.setContactnum(newStudentDetails.getContactnum());
            student.setCourse(newStudentDetails.getCourse());
            student.setDepartment(newStudentDetails.getDepartment());
            student.setYear(newStudentDetails.getYear());
  
            //Step 3 Save Information
            return srepo.save(student);
        }catch(NoSuchElementException nex) {
            throw new Exception(" ID Number " + userid + "Does Not Exist!");
        }
    }
	
	 public String deleteStudent(int userid) {
	        String msg;

	        if (srepo.findById(userid) !=null) { // Find the record
	            srepo.deleteById(userid);        // Delete the Record

	            msg = "Student is Successfully Deleted!";
	        }
	        else 
	            msg = "Student is Not Found!";

	        return msg;
	    }
	

}



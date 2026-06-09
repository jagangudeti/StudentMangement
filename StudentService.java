package net.javaguides.StudentMangement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import net.javaguides.StudentMangement.Entity.Student;
import net.javaguides.StudentMangement.Repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	public void createStudentService(Student student) {
		Student stu = new Student();
		
		//stu.setRoll_no(student.getRoll_no());
		stu.setName(student.getName());
		stu.setDepartment(student.getDepartment());
		stu.setMobil_no(student.getMobil_no());
		studentRepo.save(stu);
		
	}

	public void createStudentsServices(List<Student> students){
		
		for (Student student : students) {
	        Student stu = new Student();
	        stu.setName(student.getName());
	        stu.setDepartment(student.getDepartment());
	        stu.setMobil_no(student.getMobil_no());
	        studentRepo.save(stu);
	    }
		
	}
	public void getStudentDetails(int roll_no) {
			
		Student student = studentRepo.findById(roll_no).orElse(null);

	    if (student != null) {
	        System.out.println("Student Details:");
	        System.out.println("Name: " + student.getName());
	        System.out.println("Department: " + student.getDepartment());
	        System.out.println("Mobile No: " + student.getMobil_no());
	    } else {
	        System.out.println("No student found with roll_no: " + roll_no);
	    }
	}
	public void updateStuDetails(int roll_no,Student updatedStudent) {
		Student student = studentRepo.findById(roll_no).orElse(null);
		if (student!=null) {
			student.setName(updatedStudent.getName());
			student.setDepartment(updatedStudent.getDepartment());
			student.setMobil_no(updatedStudent.getMobil_no());
			studentRepo.save(student);			
		}else {
			System.out.println("No student found with roll_no: " + roll_no);
		}
		
	}
	public void deleteStuDetails(int roll_no) {
		Student student = studentRepo.findById(roll_no).orElse(null);
		if (student!=null) {
			studentRepo.delete(student);		
		}else {
			System.out.println("No student found with roll_no: " + roll_no);
		}
	}
		
}




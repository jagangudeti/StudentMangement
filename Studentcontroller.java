package net.javaguides.StudentMangement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.StudentMangement.Entity.Student;
import net.javaguides.StudentMangement.Service.StudentService;

@RestController
public class Studentcontroller {
	
	@Autowired
	private StudentService studentService;
	 
	@PostMapping("/createStudent")
	public void  createStudent(@RequestBody Student student) {
		
		studentService.createStudentService(student);
		
		
		
	}
	@PostMapping("/createStudents")
	public void  createStudents(@RequestBody List<Student> students) {
		
		studentService.createStudentsServices(students);
		
		
	}

	@GetMapping("/studentdetails")
	public void  getStudentDetails(@RequestParam int roll_no) {
		
		studentService.getStudentDetails(roll_no);
		
		
	}
	@PutMapping("/updateStudetails")
     public void  updateStuDetails(@RequestParam int roll_no,@RequestBody Student updatedStudent) {
		
		studentService.updateStuDetails(roll_no,updatedStudent);
		
		
	}	
	@DeleteMapping("/deleteStuDetails")
	public void deleteStuDetails(@RequestParam int roll_no) {
		
		studentService.deleteStuDetails(roll_no);
		
		
	}
	
}

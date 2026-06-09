package net.javaguides.StudentMangement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.StudentMangement.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	

}

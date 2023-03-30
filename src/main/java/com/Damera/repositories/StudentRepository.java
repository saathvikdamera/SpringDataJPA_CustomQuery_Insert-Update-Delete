package com.Damera.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.Damera.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	@Modifying
	@Transactional
	@Query(value = "insert into student(sid,sname,gender,age,marks) values(:sid,:sname,:gender,:age,:marks)" ,
			        nativeQuery = true)
	public void saveStudent(@Param("sid")Integer sid,@Param("sname")String sname,
			@Param("gender")String gender,@Param("age")Integer age,@Param("marks")Integer marks);
	
	@Modifying
	@Transactional
	@Query(value = "update student set marks = :marks where sid = :sid" , nativeQuery = true)
	public void updateStudent(@Param("marks")Integer marks,@Param("sid")Integer sid);
	
	@Modifying
	@Transactional
	@Query(value = "delete from student where sid = :sid",nativeQuery = true)
	public void deleteStudent(@Param("sid")Integer sid);

}

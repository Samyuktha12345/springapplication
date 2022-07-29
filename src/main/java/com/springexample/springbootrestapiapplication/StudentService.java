package com.springexample.springbootrestapiapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	public Student addStudent(Student s) {
		return studentrepository.save(s);
	}
	public List<Student>getStudent(){
		return studentrepository.findAll();
	}
}

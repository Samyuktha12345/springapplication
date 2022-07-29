package com.springexample.springbootrestapiapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

@Autowired
	private StudentService obj;
@GetMapping("/home")
public String home()
{
	return "Welcome to RestAPI Spring Application";
}
@GetMapping("/student")
public List<Student>getStudent(){
	return this.obj.getStudent();
}
@PostMapping("/addstudent")
public Student addstudent(@RequestBody Student s) {
	return this.obj.addStudent(s);

}
}

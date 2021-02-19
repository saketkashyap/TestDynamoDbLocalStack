package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.StudentInfo;
import com.example.demo.service.StudentService;


@RestController
@RequestMapping("/studentinfo")
public class StudentInfoController {

   private StudentService studentService;
   
	public StudentInfoController(StudentService studentService) {
		
		this.studentService= studentService;
	}
	
	@PostMapping("/post")
	public String postStudentInfo(@RequestBody StudentInfo info) {
		return studentService.saveStudent(info);
	}
	
	
	@GetMapping("/get/{rollno}")
	public StudentInfo getStudentInfo(@PathVariable("rollno") String rollNo) {
		return studentService.getStudentById(rollNo);
	}
	
}

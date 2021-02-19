package com.example.demo.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.StudentInfo;
import com.example.demo.repositories.StudentInfoRepository;

@Service
public class StudentService {
	
	private StudentInfoRepository studentRepo;
	   
	public StudentService(StudentInfoRepository studentRepo) {
		
		this.studentRepo= studentRepo;
	}

	@CachePut(value="students",key="#info.rollNo")
	public String saveStudent(StudentInfo info) {
		studentRepo.save(info);
		return "successfully saved";
	}
	
	@Cacheable(value="students")
	public StudentInfo getStudentById(String rollNo) {
		return studentRepo.findById(rollNo).get();
	}
}

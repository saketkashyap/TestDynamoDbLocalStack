package com.example.demo.repositories;

import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.StudentInfo;

@EnableScan
public interface StudentInfoRepository extends CrudRepository<StudentInfo, String> {

	Optional<StudentInfo> findByRollNo();
}

package com.example.demo.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBTable(tableName="Student_Info")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class StudentInfo implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8695041225636713679L;
	@DynamoDBHashKey(attributeName = "rollNo")
	private String rollNo;
	@DynamoDBAttribute
	private String name;
	@DynamoDBAttribute
	private String age;
}

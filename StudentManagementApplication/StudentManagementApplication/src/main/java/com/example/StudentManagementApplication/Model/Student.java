package com.example.StudentManagementApplication.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="students")
public class Student{
	@Id
	private String id;
	private String name;
	private String department;
	private int age;

	
	
}
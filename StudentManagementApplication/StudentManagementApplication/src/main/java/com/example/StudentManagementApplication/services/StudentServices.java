package com.example.StudentManagementApplication.services;

import com.example.StudentManagementApplication.Model.Student;
import com.example.StudentManagementApplication.repository.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    public void deleteStudent(String id) {
        repo.deleteById(id);
    }
}
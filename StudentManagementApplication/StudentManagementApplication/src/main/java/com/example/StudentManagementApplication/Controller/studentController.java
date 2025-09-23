package com.example.StudentManagementApplication.Controller;

import com.example.StudentManagementApplication.Model.Student;
import com.example.StudentManagementApplication.services.StudentServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class studentController {

    @Autowired
    private StudentServices service;

    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable String id) {
        return service.getStudentById(id);
    }

    @PostMapping
    public Student add(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable String id, @RequestBody Student student) {
        student.setId(id);
        return service.updateStudent(student);
    }
    

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteStudent(id);
    }
}
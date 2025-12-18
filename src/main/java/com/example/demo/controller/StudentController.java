package com.example.StudentProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentProject.entity.Student;
import com.example.StudentProject.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping("/postStudent")
    public Student add(@RequestBody Student st){
        return service.addStudent(st);
    }
    @GetMapping("/getAll")
    public List<Student> getAll(){
        return service.getAllStudents();
    }
    @GetMapping("/get/{id}")
    public Student getById(@PathVariable int id){
        return service.getById(id);
    }
    @PutMapping("/update/{id}")
    public Student update(@PathVariable int id,@RequestBody Student st){
        return service.updation(id, st);
    }
}

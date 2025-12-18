package com.example.StudentProject.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.StudentProject.entity.Student;

@Service
public class StudentService {
    Map<Integer,Student> details=new HashMap<>();
    public Student addStudent(Student st){
        details.put(st.getId(), st);
        return details.get(st.getId());
    }
    public List<Student> getAllStudents() {
        return new ArrayList<>(details.values());
    }
    public Student getById(int id){
        return details.get(id);
    }
    public Student updation(int id,Student st){
        details.replace(id, st);
        return details.get(id);
    }
}
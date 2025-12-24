package com.example.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import java.util.*;
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository stdrepo;
    @Override
    public Student poststudent(Student st){
        return stdrepo.save(st);
    }
    @Override
    public List<Student> getAllStudents(){
        return stdrepo.findAll();
    }
    @Override
    public Optional<Student> getById(Long id){
        return stdrepo.findById(id);
    }

    @Override
    public String updateData(Long id, Student st) {
        boolean status = stdrepo.existsById(id);
        if(status){
            st.setId(id);
            stdrepo.save(st);
            return "Updated Student id";
        }else{
            return "Student id not found";
        }
    }
    @Override
    public String deleteData(Long id){
        boolean status = stdrepo.existsById(id);
        if(status){
            stdrepo.deleteById(id);
            return "Student Deleted Successfully";
        }
        else{
            return "Student with Id "+id+" not found";
        }
    }
}
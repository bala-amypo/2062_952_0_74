package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public LocalDate getDob() {
        return dob;
    }
    public float getCgpa() {
        return cgpa;
    }
    
    public Student(Long id, String name, String dept, LocalDate dob, float cgpa) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.dob = dob;
        this.cgpa = cgpa;
    }

    public Student() {
    }
    


}
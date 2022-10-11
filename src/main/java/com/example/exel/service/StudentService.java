package com.example.exel.service.service;

import com.example.exel.domain.Student;

import java.util.List;


public interface StudentService {
    void addStudent(Student student);
    List < Student > getTheListStudent();
}
package com.example.exel.service;

import com.example.exel.domain.Student;
import com.example.exel.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
    @Override
    public List<Student> getTheListStudent() {
        return studentRepository.findAll();
    }
}

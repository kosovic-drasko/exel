package com.example.exel.repository;


import com.example.exel.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long > {
}
package com.example.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college.dao.student;

public interface StudentRepository extends JpaRepository<student, Integer>{

}

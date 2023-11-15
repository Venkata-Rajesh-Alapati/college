package com.example.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college.dao.college;

public interface ClassRepository extends JpaRepository<college, String>{

}

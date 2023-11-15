package com.example.college.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.college.dao.college;
import com.example.college.repository.ClassRepository;

@Controller
@RequestMapping("/colleges")
public class CollegeController {
	
	@Autowired
	private ClassRepository classjpa;
	
	@GetMapping
	@ResponseBody
	public List<college> getUsers() {
		return classjpa.findAll();
	}

}

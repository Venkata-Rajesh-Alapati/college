package com.example.college.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.college.dao.apply;
import com.example.college.repository.ApplyRepository;

@Controller
@RequestMapping("/apply")
public class ApplyController {
	
	@Autowired
	private ApplyRepository applyjpa;
	
	
	@GetMapping
	@ResponseBody
	public List<apply> getUsers() {
		return applyjpa.findAll();
	}

}

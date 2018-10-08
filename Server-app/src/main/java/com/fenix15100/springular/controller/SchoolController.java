package com.fenix15100.springular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fenix15100.springular.repository.SchoolRepository;


@RestController
@RequestMapping("/api/school")
public class SchoolController {
	
	@Autowired
	SchoolRepository schoolRepository;
	
	
	

}

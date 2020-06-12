package com.cognizant.springemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springemployee.model.Department;
import com.cognizant.springemployee.service.DepartmentService;


@RestController
public class DepartmentController {
	

	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments()
	{
		return departmentService.getAllDepartments();
	}
}

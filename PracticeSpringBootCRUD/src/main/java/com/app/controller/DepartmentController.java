package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.service.DepartmentService;

@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService deptService;

	public DepartmentController() {
		System.out.println("in dept controller ctor");
	}
	@GetMapping("/list")
	public ModelAndView getDeptDetails() {
		System.out.println("in get dept list");

		return new ModelAndView("/dept/list", "dept_list", deptService.getDepartmentDetails());

	}
	
	
	

}

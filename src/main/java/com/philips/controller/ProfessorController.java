package com.philips.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.philips.entity.Department;
import com.philips.service.DepartmentService;
import com.philips.service.ProfessorSevice;

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorSevice professorSevice;

	@Autowired
	private ConversionService conversionService;

	@GetMapping(value = "/search")
	public ResponseEntity<List<Department>> getAllDepartments() {

		List<Department> departments = professorSevice.getByProfessorName();
		List<com.philips.model.Department> departmentList = new ArrayList<>();

		if (CollectionUtils.isNotEmpty(departments)) {
			departments.stream().forEach(
					obj -> departmentList.add(conversionService.convert(obj, com.philips.model.Department.class)));

		}
		return new ResponseEntity<>(departments, HttpStatus.OK);

	}

}

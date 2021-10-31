package com.philips.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.philips.entity.Department;
import com.philips.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private ConversionService conversionService;

	@GetMapping(value = "/departments")
	public ResponseEntity<List<Department>> getAllDepartments() {

		List<Department> departments = departmentService.getAllDepartments();
		List<com.philips.model.Department> departmentList = new ArrayList<>();

		if (CollectionUtils.isNotEmpty(departments)) {
			departments.stream().forEach(
					obj -> departmentList.add(conversionService.convert(obj, com.philips.model.Department.class)));

		}
		return new ResponseEntity<>(departments, HttpStatus.OK);

	}

	@PostMapping("/departments")
	public ResponseEntity<Department> createDepartment(@RequestBody Department department) {

		try {
			Department departments = departmentService.createDepartment(department);
			return new ResponseEntity<>(departments, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/departments/{id}")
	public ResponseEntity<Department> removeDepartment(@PathVariable("id") long id) {
		try {
			departmentService.removeDepartment(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

package com.philips.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.philips.entity.Department;

@Service
public interface DepartmentService {

	List<Department> getAllDepartments();

	Department createDepartment(Department department);

	void removeDepartment(long id);
	
	

}

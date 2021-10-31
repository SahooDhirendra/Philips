package com.philips.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philips.entity.Department;
import com.philips.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();

	}

	@Override
	public Department createDepartment(Department department) {
		return departmentRepository.save(department);

	}

	@Override
	public void removeDepartment(long id) {
		departmentRepository.deleteById(id);
		
	}

}

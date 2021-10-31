package com.philips.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.philips.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}

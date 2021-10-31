package com.philips.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.philips.entity.Department;

@Repository
public interface ProfessorRepository {

	List<Department> findProfessorByName();

}

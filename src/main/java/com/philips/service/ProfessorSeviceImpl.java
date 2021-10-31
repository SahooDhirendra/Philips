package com.philips.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philips.entity.Department;
import com.philips.repository.ProfessorRepository;

@Service
public class ProfessorSeviceImpl implements ProfessorSevice {

	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@Override
	public List<Department> getByProfessorName() {
	
		return professorRepository.findProfessorByName();
	}

}

package com.philips.model.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.philips.entity.Department;

@Component
public class DepartmentEntityToModelConverter implements Converter<Department, com.philips.model.Department> {

	@Override
	public com.philips.model.Department convert(Department source) {

		com.philips.model.Department target = new com.philips.model.Department();
		target.setId(source.getId());
		target.setName(source.getName());
		return target;
	}

}

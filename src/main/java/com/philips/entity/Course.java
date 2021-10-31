package com.philips.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "COURSE")
public class Course {

	@Id
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DEPARTMENT_ID")
	private long departmentId;

	@Column(name = "CREDITS")
	private long credits;

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Department> departments;

}

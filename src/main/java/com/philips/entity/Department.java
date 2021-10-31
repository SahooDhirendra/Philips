package com.philips.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTMENT")
public class Department {

	@Id
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Professor> professor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Course course;

}

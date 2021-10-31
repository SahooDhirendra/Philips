package com.philips.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PROFESSOR")
public class Professor {

	@Id
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME")
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	private Department department;

}

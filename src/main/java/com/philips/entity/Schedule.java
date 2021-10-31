package com.philips.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "SCHEDULE")
public class Schedule {

	@Id
	@Column(name = "YEAR")
	private long year;

	@Column(name = "PROFESSOR_ID")
	private long professorId;

	@Column(name = "COURSE_ID")
	private long courseId;

	@Column(name = "SEMESTER")
	private long semester;

}

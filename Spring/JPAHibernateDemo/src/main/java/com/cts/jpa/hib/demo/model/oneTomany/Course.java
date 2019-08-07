package com.cts.jpa.hib.demo.model.oneTomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	private int cuid;
	
	@Column(name= "coursename")
	private String name;
	
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
	private Set<Trainee> trainees;
	
	public Course() {}

	public Course(int cuid, String name, Set<Trainee> trainees) {
		super();
		this.cuid = cuid;
		this.name = name;
		this.trainees = trainees;
	}

	public int getCuid() {
		return cuid;
	}

	public void setCuid(int cuid) {
		this.cuid = cuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}

	@Override
	public String toString() {
		return "Course [cuid=" + cuid + ", name=" + name + ", trainees=" + trainees + "]";
	}
	
	
	

}

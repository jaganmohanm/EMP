package com.kickstart.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmpPojo")
public class EmpPojo {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("name=" +name);
	}
	@Override
	public String toString() {
		return "EmpPojo [id=" + id + ", name=" + name + "]";
	}
	
	

}

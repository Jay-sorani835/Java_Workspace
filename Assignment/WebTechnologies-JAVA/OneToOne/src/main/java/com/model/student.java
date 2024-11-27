package com.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student")
public class student 
{
	@OneToOne(cascade = CascadeType.ALL)  // Cascade all operations to the Address entity
    @JoinColumn(name = "address_id") 
	Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Id
	@GeneratedValue
	@GenericGenerator(name = "increment" ,strategy = "increment")
	@Column(name = "studentId")
	int id;
	
	@Column(name = "studentName")
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
	}
	
	
}

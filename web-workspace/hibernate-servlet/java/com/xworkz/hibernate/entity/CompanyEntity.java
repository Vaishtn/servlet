package com.xworkz.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COMPANY")

public class CompanyEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")

	private String name;
	@Column(name="PHONE")

	private String phone;
	@Column(name="COMPANY")

	private String company;
	@Column(name="EMAIL")

	private String email;
	

}

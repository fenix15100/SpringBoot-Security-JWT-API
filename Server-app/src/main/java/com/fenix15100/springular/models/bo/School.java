package com.fenix15100.springular.models.bo;


import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fenix15100.springular.models.audit.DateAudit;






@SuppressWarnings("serial")
@Entity
@Table(name="school")
public class School  extends DateAudit implements Serializable {


	private  Integer id;

	private String name;

	private String street;


	

	public School() {
	}

	public School(Integer id_school, String name, String street) {
		super();
		this.id = id_school;
		this.name = name;
		this.street = street;

	}
	
	public School(String name, String street) {
		super();
		this.name = name;
		this.street = street;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_school")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id_school) {
		this.id = id_school;
	}

	@NotBlank
	@Size(min=4,max=25)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Size(min=4,max=50)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}

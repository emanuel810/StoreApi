package com.example.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "clients")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long client_id;
	
	@NotBlank(message = "fill in this field")
	private String name;
	
	@NotBlank(message = "fill in this field")
	private String surname;
	
	@NotBlank(message = "fill in this field")
	private String user;
	
	@NotBlank(message = "fill in this field")
	private String password;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getClient_id() {
		return client_id;
	}
	
	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}

}

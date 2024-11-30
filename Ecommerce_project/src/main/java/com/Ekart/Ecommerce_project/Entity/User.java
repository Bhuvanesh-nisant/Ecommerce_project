package com.Ekart.Ecommerce_project.Entity;

import com.Ekart.Ecommerce_project.Entity.Enums.UserRole;

import com.Ekart.Ecommerce_project.Entity.Enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //increment the id while creating new user
	private Long Id;
	
	private String email;
	
	private String password;
	
	private String name;
	
	private UserRole role;
	
	@Lob
	@Column(columnDefinition = "Longblob")
	private byte[] img;
	

}




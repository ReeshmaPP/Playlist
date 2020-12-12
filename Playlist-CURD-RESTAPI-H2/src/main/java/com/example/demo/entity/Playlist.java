package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Playlist {

	@Id  
	//defining id as column name  
	@Column  
	private int id;  
	//defining name as column name  
	@Column  
	private String name;  
	//defining age as column name  
	
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

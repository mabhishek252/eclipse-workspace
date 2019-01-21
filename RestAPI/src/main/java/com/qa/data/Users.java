package com.qa.data;

//This class is created for marshaling purpose so that value can 
//store in this class and can be converted to JSON format

public class Users {

	String name;
	String job;
	String id;
	String createdAt;
	String updatedAt;
	

	//Constructor
	public Users() {
	}
	
	//Constructor with name and job
	public Users(String name, String job) {
		this.name = name;
		this.job = job;
	}
	

	//geter methods for Name variable
	public String getName() {
		return name;
	}

	//setter methods for Name variable
	public void setName(String name) {
		this.name = name;
	}

	//geter methods for Job variable
	public String getJob() {
		return job;
	}

	//setter methods for Job variable
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}

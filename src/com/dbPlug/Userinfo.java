package com.dbPlug;

import baseModelPackage;

public class Userinfoextends BaseModel  {

	private Integer password;
	private Integer id;
	private String username;


	public Integer getPassword(){
		return password;
	}
	public Integer getId(){
		return id;
	}
	public String getUsername(){
		return username;
	}
	public void setPassword(Integer password){
		this.password=password;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public void setUsername(String username){
		this.username=username;
	}
}

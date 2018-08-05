package com.dbPlug;

import baseModelPackage;

public class Cmp_funtionextends BaseModel  {

	private java.sql.Timestamp update_time;
	private java.sql.Timestamp create_time;
	private String funtion_content;
	private String id;
	private Integer isdel;
	private Integer rowid;
	private String isdel_per;


	public java.sql.Timestamp getUpdate_time(){
		return update_time;
	}
	public java.sql.Timestamp getCreate_time(){
		return create_time;
	}
	public String getFuntion_content(){
		return funtion_content;
	}
	public String getId(){
		return id;
	}
	public Integer getIsdel(){
		return isdel;
	}
	public Integer getRowid(){
		return rowid;
	}
	public String getIsdel_per(){
		return isdel_per;
	}
	public void setUpdate_time(java.sql.Timestamp update_time){
		this.update_time=update_time;
	}
	public void setCreate_time(java.sql.Timestamp create_time){
		this.create_time=create_time;
	}
	public void setFuntion_content(String funtion_content){
		this.funtion_content=funtion_content;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setIsdel(Integer isdel){
		this.isdel=isdel;
	}
	public void setRowid(Integer rowid){
		this.rowid=rowid;
	}
	public void setIsdel_per(String isdel_per){
		this.isdel_per=isdel_per;
	}
}

package com.dbPlug;

import baseModelPackage;

public class Cmp_duty_valueextends BaseModel  {

	private String funtion_org_id;
	private java.sql.Timestamp update_time;
	private java.sql.Timestamp create_time;
	private String id;
	private Integer isdel;
	private String content;
	private Integer rowid;
	private String isdel_per;


	public String getFuntion_org_id(){
		return funtion_org_id;
	}
	public java.sql.Timestamp getUpdate_time(){
		return update_time;
	}
	public java.sql.Timestamp getCreate_time(){
		return create_time;
	}
	public String getId(){
		return id;
	}
	public Integer getIsdel(){
		return isdel;
	}
	public String getContent(){
		return content;
	}
	public Integer getRowid(){
		return rowid;
	}
	public String getIsdel_per(){
		return isdel_per;
	}
	public void setFuntion_org_id(String funtion_org_id){
		this.funtion_org_id=funtion_org_id;
	}
	public void setUpdate_time(java.sql.Timestamp update_time){
		this.update_time=update_time;
	}
	public void setCreate_time(java.sql.Timestamp create_time){
		this.create_time=create_time;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setIsdel(Integer isdel){
		this.isdel=isdel;
	}
	public void setContent(String content){
		this.content=content;
	}
	public void setRowid(Integer rowid){
		this.rowid=rowid;
	}
	public void setIsdel_per(String isdel_per){
		this.isdel_per=isdel_per;
	}
}

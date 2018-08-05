package com.dbPlug;

import baseModelPackage;

public class Cmp_funtion_orgextends BaseModel  {

	private java.sql.Timestamp update_time;
	private Integer bizType;
	private java.sql.Timestamp create_time;
	private String duty_id;
	private String bizId;
	private String id;
	private Integer isdel;
	private String funtion_id;
	private Integer rowid;
	private String isdel_per;


	public java.sql.Timestamp getUpdate_time(){
		return update_time;
	}
	public Integer getBizType(){
		return bizType;
	}
	public java.sql.Timestamp getCreate_time(){
		return create_time;
	}
	public String getDuty_id(){
		return duty_id;
	}
	public String getBizId(){
		return bizId;
	}
	public String getId(){
		return id;
	}
	public Integer getIsdel(){
		return isdel;
	}
	public String getFuntion_id(){
		return funtion_id;
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
	public void setBizType(Integer bizType){
		this.bizType=bizType;
	}
	public void setCreate_time(java.sql.Timestamp create_time){
		this.create_time=create_time;
	}
	public void setDuty_id(String duty_id){
		this.duty_id=duty_id;
	}
	public void setBizId(String bizId){
		this.bizId=bizId;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setIsdel(Integer isdel){
		this.isdel=isdel;
	}
	public void setFuntion_id(String funtion_id){
		this.funtion_id=funtion_id;
	}
	public void setRowid(Integer rowid){
		this.rowid=rowid;
	}
	public void setIsdel_per(String isdel_per){
		this.isdel_per=isdel_per;
	}
}

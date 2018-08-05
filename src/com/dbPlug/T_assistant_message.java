package com.dbPlug;

import baseModelPackage;

public class T_assistant_messageextends BaseModel  {

	private String create_by;
	private String message_content;
	private java.sql.Timestamp updated_at;
	private null create_time;
	private null modify_time;
	private null created_at;
	private java.sql.Timestamp drc_check_time;
	private Integer message_type;
	private Long id;
	private String modify_by;
	private Integer is_delete;


	public String getCreate_by(){
		return create_by;
	}
	public String getMessage_content(){
		return message_content;
	}
	public java.sql.Timestamp getUpdated_at(){
		return updated_at;
	}
	public null getCreate_time(){
		return create_time;
	}
	public null getModify_time(){
		return modify_time;
	}
	public null getCreated_at(){
		return created_at;
	}
	public java.sql.Timestamp getDrc_check_time(){
		return drc_check_time;
	}
	public Integer getMessage_type(){
		return message_type;
	}
	public Long getId(){
		return id;
	}
	public String getModify_by(){
		return modify_by;
	}
	public Integer getIs_delete(){
		return is_delete;
	}
	public void setCreate_by(String create_by){
		this.create_by=create_by;
	}
	public void setMessage_content(String message_content){
		this.message_content=message_content;
	}
	public void setUpdated_at(java.sql.Timestamp updated_at){
		this.updated_at=updated_at;
	}
	public void setCreate_time(null create_time){
		this.create_time=create_time;
	}
	public void setModify_time(null modify_time){
		this.modify_time=modify_time;
	}
	public void setCreated_at(null created_at){
		this.created_at=created_at;
	}
	public void setDrc_check_time(java.sql.Timestamp drc_check_time){
		this.drc_check_time=drc_check_time;
	}
	public void setMessage_type(Integer message_type){
		this.message_type=message_type;
	}
	public void setId(Long id){
		this.id=id;
	}
	public void setModify_by(String modify_by){
		this.modify_by=modify_by;
	}
	public void setIs_delete(Integer is_delete){
		this.is_delete=is_delete;
	}
}

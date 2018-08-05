package com.dbPlug;

import baseModelPackage;

public class T_material_group_warhouseextends BaseModel  {

	private String material_priority;
	private Integer material _group_id;
	private Integer material_id;
	private Long id;
	private Integer warehouse_id;
	private Integer is_delete;


	public String getMaterial_priority(){
		return material_priority;
	}
	public Integer getMaterial _group_id(){
		return material _group_id;
	}
	public Integer getMaterial_id(){
		return material_id;
	}
	public Long getId(){
		return id;
	}
	public Integer getWarehouse_id(){
		return warehouse_id;
	}
	public Integer getIs_delete(){
		return is_delete;
	}
	public void setMaterial_priority(String material_priority){
		this.material_priority=material_priority;
	}
	public void setMaterial _group_id(Integer material _group_id){
		this.material _group_id=material _group_id;
	}
	public void setMaterial_id(Integer material_id){
		this.material_id=material_id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public void setWarehouse_id(Integer warehouse_id){
		this.warehouse_id=warehouse_id;
	}
	public void setIs_delete(Integer is_delete){
		this.is_delete=is_delete;
	}
}

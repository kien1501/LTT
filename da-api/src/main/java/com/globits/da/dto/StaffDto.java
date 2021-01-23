package com.globits.da.dto;

import com.globits.da.domain.Staff;

public class StaffDto extends BaseObjectDto {
	private String code;
	private String type;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public StaffDto() {
		super();
	}
	public StaffDto(Staff e) {
		if(e != null) {
			this.setId(e.getId());
			this.code = e.getCode();
			this.type = e.getType();
		}
	}
}

package com.globits.da.dto;

import com.globits.da.domain.Staff;

public class StaffDto extends BaseObjectDto {
	private String code;
	private String type;
	private String displayNane;
	private String email;
	private String phoneNumber;
	
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
	
	public String getDisplayNane() {
		return displayNane;
	}
	public void setDisplayNane(String displayNane) {
		this.displayNane = displayNane;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public StaffDto() {
		super();
	}
	public StaffDto(Staff e) {
		if(e != null) {
			this.setId(e.getId());
			this.code = e.getCode();
			this.type = e.getType();
			this.displayNane = e.getDisplayName();
			this.phoneNumber = e.getPhoneNumber();
			this.email = e.getEmail();
		}
	}
}

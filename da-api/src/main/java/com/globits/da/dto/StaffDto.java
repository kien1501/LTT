package com.globits.da.dto;

import com.globits.da.domain.Staff;

public class StaffDto extends BaseObjectDto {
	private String code;
	private Integer type;
	private String displayName;
	private String email;
	private String phoneNumber;
	private Boolean hasUserName = false;				//Tên đăng nhâp đã tồn tại ( = true)
	private Boolean hasPhoneNumber = false;				//Số điện thoại đã tồn tại ( = true)
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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
	
	public Boolean getHasUserName() {
		return hasUserName;
	}
	public void setHasUserName(Boolean hasUserName) {
		this.hasUserName = hasUserName;
	}
	public Boolean getHasPhoneNumber() {
		return hasPhoneNumber;
	}
	public void setHasPhoneNumber(Boolean hasPhoneNumber) {
		this.hasPhoneNumber = hasPhoneNumber;
	}
	public StaffDto() {
		super();
	}
	public StaffDto(Staff e) {
		if(e != null) {
			this.setId(e.getId());
			this.code = e.getCode();
			this.type = e.getType();
			this.displayName = e.getDisplayName();
			this.phoneNumber = e.getPhoneNumber();
			this.email = e.getEmail();
		}
	}
}

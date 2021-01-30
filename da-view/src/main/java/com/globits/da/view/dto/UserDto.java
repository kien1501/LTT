package com.globits.da.view.dto;

import java.util.Date;

public class UserDto {
	private String name;
	private String code;
	private String address;
	private String phoneNumber;
	private String email;
	private Integer customerType;
	private UserDto user;
	private String username;
	private String password;//Tên đăng nhập
	private String gender;						//Giới tính
	private Date birthDate;						//Ngày sinh
	private Boolean isDefault;						//mặc định của Person
	private Boolean isDefaultShippingAddress;		//mặc định địa chỉ giao hàng
	private String fullAddress;					//Địa chỉ đầy đủ để hiển thị ra giao diện
	private Integer age;//tuổi
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getCustomerType() {
		return customerType;
	}
	public void setCustomerType(Integer customerType) {
		this.customerType = customerType;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	public Boolean getIsDefaultShippingAddress() {
		return isDefaultShippingAddress;
	}
	public void setIsDefaultShippingAddress(Boolean isDefaultShippingAddress) {
		this.isDefaultShippingAddress = isDefaultShippingAddress;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}

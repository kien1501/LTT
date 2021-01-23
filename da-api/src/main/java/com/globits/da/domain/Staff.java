package com.globits.da.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.globits.core.domain.Person;
@Entity
@Table(name = "tbl_staff")
public class Staff extends Person{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "code")
	private String code;
	@Column(name = "type")
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}

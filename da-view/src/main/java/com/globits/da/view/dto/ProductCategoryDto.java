package com.globits.da.view.dto;

import java.util.List;

public class ProductCategoryDto {
	private String name;
	private String code;
	private List<ProductDto> listProduct;
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
	public List<ProductDto> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<ProductDto> listProduct) {
		this.listProduct = listProduct;
	}
	
	
}

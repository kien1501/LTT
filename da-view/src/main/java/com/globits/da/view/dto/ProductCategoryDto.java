package com.globits.da.view.dto;

import java.util.ArrayList;
import java.util.List;

import com.globits.da.view.dto.ProductDto;public class ProductCategoryDto {
	private String name;
	private String code;
private List<ProductDto> listProduct = new ArrayList<ProductDto>();
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

package com.globits.da.view.dto;

public class ProductWarehouseDto {
	private WarehouseDto warehouse;
	private ProductDto product;
	private Integer productNumber;
	public WarehouseDto getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(WarehouseDto warehouse) {
		this.warehouse = warehouse;
	}
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	public Integer getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}
	
	
}

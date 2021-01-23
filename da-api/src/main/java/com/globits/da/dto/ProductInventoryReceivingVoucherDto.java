package com.globits.da.dto;

import com.globits.da.domain.ProductInventoryReceivingVoucher;

public class ProductInventoryReceivingVoucherDto extends BaseObjectDto{
	private ProductDto product;
	private WarehouseDto warehouse;
	private Integer productNumber;
	private Double price;
	private InventoryReceivingVoucherDto inventoryReceivingVoucher;
	
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	public WarehouseDto getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(WarehouseDto warehouse) {
		this.warehouse = warehouse;
	}
	public Integer getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public InventoryReceivingVoucherDto getInventoryReceivingVoucher() {
		return inventoryReceivingVoucher;
	}
	public void setInventoryReceivingVoucher(InventoryReceivingVoucherDto inventoryReceivingVoucher) {
		this.inventoryReceivingVoucher = inventoryReceivingVoucher;
	}
	public ProductInventoryReceivingVoucherDto() {
		super();
	}
	public ProductInventoryReceivingVoucherDto(ProductInventoryReceivingVoucher p) {
		if(p != null) {
			this.setId(p.getId());
			if(p.getProduct() != null) {
				this.product = new ProductDto(p.getProduct());
			}
			if(p.getWarehouse() != null) {
				this.warehouse = new WarehouseDto(p.getWarehouse());
			}
			if(p.getInventoryReceivingVoucher() != null) {
				this.inventoryReceivingVoucher = new InventoryReceivingVoucherDto(p.getInventoryReceivingVoucher(),true);
			}
			this.productNumber = p.getProductNumber();
			this.price = p.getPrice();
		}
	}
}

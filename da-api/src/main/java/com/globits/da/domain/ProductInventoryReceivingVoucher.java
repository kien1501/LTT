package com.globits.da.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.globits.core.domain.BaseObject;
@Entity
@Table(name = "tbl_product_inventory_receiving_voucher")
public class ProductInventoryReceivingVoucher extends BaseObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	@ManyToOne
	@JoinColumn(name="warehouse_id")
	private Warehouse warehouse;
	@Column(name = "product_number")
	private Integer productNumber;
	@Column(name = "price")
	private Double price;
	@ManyToOne
	@JoinColumn(name="inventory_receiving_voucher_id")
	private InventoryReceivingVoucher inventoryReceivingVoucher;
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
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

	public InventoryReceivingVoucher getInventoryReceivingVoucher() {
		return inventoryReceivingVoucher;
	}

	public void setInventoryReceivingVoucher(InventoryReceivingVoucher inventoryReceivingVoucher) {
		this.inventoryReceivingVoucher = inventoryReceivingVoucher;
	}
	
	
}

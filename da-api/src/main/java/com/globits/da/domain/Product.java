package com.globits.da.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.globits.core.domain.BaseObject;
@Entity
@Table(name = "tbl_product")
public class Product extends BaseObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "name")
	private String name;
	@Column(name = "code")
	private String code;
	@Column(name = "current_selling_price")
	private Double currentSellingPrice;
	@ManyToOne
	@JoinColumn(name="stock_keepingCunit_id")
	private StockKeepingUnit stockKeepingUnit;
	@ManyToOne
	@JoinColumn(name="product_category_id")
	private ProductCategory productCategory;
	@ManyToOne
	@JoinColumn(name="supplier_id")
	private Supplier supplier;
	@OneToMany(mappedBy = "product", cascade=CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval=true)
	private Set<ProductWarehouse> productWarehouse;
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private Set<ProductImage> productImage;
	@Column(name="image_url")
	private String imageUrl;//Đường dẫn đến File ảnh tiêu đề bài báo (nếu có)
	
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
	public Double getCurrentSellingPrice() {
		return currentSellingPrice;
	}
	public void setCurrentSellingPrice(Double currentSellingPrice) {
		this.currentSellingPrice = currentSellingPrice;
	}
	public StockKeepingUnit getStockKeepingUnit() {
		return stockKeepingUnit;
	}
	public void setStockKeepingUnit(StockKeepingUnit stockKeepingUnit) {
		this.stockKeepingUnit = stockKeepingUnit;
	}
	
	public Set<ProductWarehouse> getProductWarehouse() {
		return productWarehouse;
	}
	public void setProductWarehouse(Set<ProductWarehouse> productWarehouse) {
		this.productWarehouse = productWarehouse;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Set<ProductImage> getProductImage() {
		return productImage;
	}
	public void setProductImage(Set<ProductImage> productImage) {
		this.productImage = productImage;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	
}

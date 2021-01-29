package com.globits.da.view.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductDto {
	private String name;
	private String code;
	private Double currentSellingPrice;
	private StockKeepingUnitDto stockKeepingUnit;
	private Integer soLuongDangCo;
	private Set<ProductWarehouseDto> productWarehouse;
	private ProductCategoryDto productCategory;
	private SupplierDto supplier;
	private String imageUrl;//Đường dẫn đến File ảnh tiêu đề bài báo (nếu có)
	private List<ImageDto> images;
	private String posts;
	private Set<ColorDto> productColors = new HashSet<ColorDto>();
	private Double price;
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
	public StockKeepingUnitDto getStockKeepingUnit() {
		return stockKeepingUnit;
	}
	public void setStockKeepingUnit(StockKeepingUnitDto stockKeepingUnit) {
		this.stockKeepingUnit = stockKeepingUnit;
	}
	public Integer getSoLuongDangCo() {
		return soLuongDangCo;
	}
	public void setSoLuongDangCo(Integer soLuongDangCo) {
		this.soLuongDangCo = soLuongDangCo;
	}
	public Set<ProductWarehouseDto> getProductWarehouse() {
		return productWarehouse;
	}
	public void setProductWarehouse(Set<ProductWarehouseDto> productWarehouse) {
		this.productWarehouse = productWarehouse;
	}
	public ProductCategoryDto getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategoryDto productCategory) {
		this.productCategory = productCategory;
	}
	public SupplierDto getSupplier() {
		return supplier;
	}
	public void setSupplier(SupplierDto supplier) {
		this.supplier = supplier;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public List<ImageDto> getImages() {
		return images;
	}
	public void setImages(List<ImageDto> images) {
		this.images = images;
	}
	public String getPosts() {
		return posts;
	}
	public void setPosts(String posts) {
		this.posts = posts;
	}
	public Set<ColorDto> getProductColors() {
		return productColors;
	}
	public void setProductColors(Set<ColorDto> productColors) {
		this.productColors = productColors;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}

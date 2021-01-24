package com.globits.da.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.globits.core.domain.BaseObject;

@Entity
@Table(name = "tbl_product_color")
public class ProductColor extends BaseObject{
	@ManyToOne
	@JoinColumn(name = "color_id")
	private Color color;//màu
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;//sản phẩm

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}

package com.globits.da.view.dto;

import com.globits.da.view.dto.EventDto;
import com.globits.da.view.dto.ProductDto;

public class ProductEventDto {
	private EventDto event;
	private ProductDto product;
	private Float discountPercent;
	public EventDto getEvent() {
		return event;
	}
	public void setEvent(EventDto event) {
		this.event = event;
	}
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	public Float getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(Float discountPercent) {
		this.discountPercent = discountPercent;
	}
	
}

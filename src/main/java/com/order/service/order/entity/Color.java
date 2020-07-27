package com.order.service.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="color_save")
public class Color {
	
	@Id
	@GeneratedValue( strategy  = GenerationType.AUTO)
	@Column(name="ORDER_COLOR_ID")
	private int orderColorId;
	
	@Column(name="COLOR_ID")
	private int colorId;
	
	@Column(name="COLOR_NAME")
	private String colorName;
	
	@Column(name="ORDER_ID")
	private String orderId;
	
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getColorId() {
		return colorId;
	}
	
	public int getOrderColorId() {
		return orderColorId;
	}

	public void setOrderColorId(int orderColorId) {
		this.orderColorId = orderColorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public Color(int colorId, String colorName , String orderId) {
		super();
		this.colorId = colorId;
		this.colorName = colorName;
		this.orderId = orderId;
	}

	public Color() {
		super();
		
	}

	
	
	
}

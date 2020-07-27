package com.order.service.order.dto;

import java.util.List;

import com.order.service.order.entity.Accessory;
import com.order.service.order.entity.Color;

//import com.order.service.order.entity.Accessory;
//import com.order.service.order.entity.Color;

public class OrderDTO {

	private String orderId;
	
	private String series;
	
	private String model;
	
	private double totalPrice;
	
	private List<Color> color;	
	private List<Accessory> accessory;
	
	public List<Color> getColor() {
		return color;
	}

	public void setColor(List<Color> color) {
		this.color = color;
	}

	public List<Accessory> getAccessory() {
		return accessory;
	}

	public void setAccessory(List<Accessory> accessory) {
		this.accessory = accessory;
	}

	
	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	

	public OrderDTO(String orderId, String series, String model, List<Color> color, List<Accessory> accessory,
			double totalPrice) {
		super();
		this.orderId = orderId;
		this.series = series;
		this.model = model;
		this.color = color;
		this.accessory = accessory;
		this.totalPrice = totalPrice;
	}

	public OrderDTO() {
		super();
	}
	
	
}

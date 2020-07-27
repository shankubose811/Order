package com.order.service.order.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_save")
public class Order {
	
	@Id
	@Column(name="ORDER_ID")
	private String orderId;
	
	@Column(name="S_NAME")
	private String seriesName;
	
	@Column(name="M_NAME")
	private String modelName;

	@Column(name="TOTAL_PRICE")
	private double totalPrice;

	@OneToMany
	@JoinColumn(name="ORDER_ID")
	private List<Accessory> accyList;

	@OneToMany
	@JoinColumn(name="ORDER_ID")
	private List<Color> colorList;


	public String getOrderId() {
		return orderId;
	}




	public Order(String orderId, String seriesName, String modelName, double totalPrice) {
		super();
		this.orderId = orderId;
		this.seriesName = seriesName;
		this.modelName = modelName;
		this.totalPrice = totalPrice;
	}




	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}




	public String getSeriesName() {
		return seriesName;
	}




	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}




	public String getModelName() {
		return modelName;
	}




	public void setModelName(String modelName) {
		this.modelName = modelName;
	}




	public double getTotalPrice() {
		return totalPrice;
	}




	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}




	public Order() {
		super();
	}

	
}

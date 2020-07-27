package com.order.service.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accy_save")
public class Accessory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDER_ACCY_ID")
	private int orderAccesId;
	
	
	@Column(name="ACCY_ID")
	private int accyId;
	
	@Column(name="ACCY_NAME")
	private String accyName;
	
	@Column(name="ORDER_ID")
	private String orderId;

	public Accessory(int accyId, String accyName, String orderId) {
		super();
		this.accyId = accyId;
		this.accyName = accyName;
		this.orderId = orderId;
	}

	public int getAccyId() {
		return accyId;
	}

	public void setAccyId(int accyId) {
		this.accyId = accyId;
	}

	public String getAccyName() {
		return accyName;
	}

	public void setAccyName(String accyName) {
		this.accyName = accyName;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getOrderAccesId() {
		return orderAccesId;
	}

	public void setOrderAccesId(int orderAccesId) {
		this.orderAccesId = orderAccesId;
	}

	public Accessory() {
		super();
	}
	
	
}

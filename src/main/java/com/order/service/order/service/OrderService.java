package com.order.service.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.order.service.order.dto.OrderDTO;
import com.order.service.order.entity.Accessory;
import com.order.service.order.entity.Order;
import com.order.service.order.repo.AccessoryRepo;
import com.order.service.order.repo.OrderRepo;

@Service
@Transactional
public class OrderService {

	@Autowired 
	OrderRepo repo;
	
	@Autowired
	AccessoryRepo accyRepo;
		
	public boolean saveOrder(OrderDTO order) {
		
		Order saveOrder = new Order(order.getOrderId() , order.getSeries() , order.getModel() ,
				order.getTotalPrice() );
		
		Accessory accy = new Accessory();
		
		repo.save(saveOrder);
		
		
		return true;
		
	
		
	}
	
	
	

}

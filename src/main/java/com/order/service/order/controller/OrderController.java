package com.order.service.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.order.service.order.dto.OrderDTO;
import com.order.service.order.entity.Order;
import com.order.service.order.service.OrderService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class OrderController {

	@Autowired
	OrderService orderService;

	@RequestMapping("/order")
	public boolean saveOrders( @RequestBody OrderDTO order)
	{
		//String createOrder = orderService.saveOrder(order);
		
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(createOrder.getOrderId()).toUri();
//		
//		return ResponseEntity.created(uri).build();
		
		
		
		orderService.saveOrder(order);
		
		
		
		return true;
	}

	
	
}

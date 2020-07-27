package com.order.service.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.service.order.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, String> {

}

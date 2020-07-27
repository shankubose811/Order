package com.order.service.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.service.order.entity.Accessory;

@Repository
public interface AccessoryRepo extends JpaRepository<Accessory, Integer>{

}

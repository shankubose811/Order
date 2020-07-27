package com.order.service.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.service.order.entity.Color;

@Repository
public interface ColorRepo  extends JpaRepository<Color, Integer>{

}

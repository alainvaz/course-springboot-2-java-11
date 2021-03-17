package com.alain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alain.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

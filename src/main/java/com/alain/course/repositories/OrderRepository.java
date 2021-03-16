package com.alain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alain.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

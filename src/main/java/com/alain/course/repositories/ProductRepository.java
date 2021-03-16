package com.alain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alain.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

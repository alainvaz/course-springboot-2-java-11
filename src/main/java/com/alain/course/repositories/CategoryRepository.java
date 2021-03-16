package com.alain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alain.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

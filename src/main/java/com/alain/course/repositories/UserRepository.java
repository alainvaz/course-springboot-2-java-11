package com.alain.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alain.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

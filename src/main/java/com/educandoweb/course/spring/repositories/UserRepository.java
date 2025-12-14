package com.educandoweb.course.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

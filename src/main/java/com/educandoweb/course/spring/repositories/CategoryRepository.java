package com.educandoweb.course.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

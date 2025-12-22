package com.educandoweb.course.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.spring.entities.OrderItem;
import com.educandoweb.course.spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

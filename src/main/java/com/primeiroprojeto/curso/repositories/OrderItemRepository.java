package com.primeiroprojeto.curso.repositories;

import com.primeiroprojeto.curso.entities.OrderItem;
import com.primeiroprojeto.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}

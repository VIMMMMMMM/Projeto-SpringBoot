package com.primeiroprojeto.curso.repositories;

import com.primeiroprojeto.curso.entities.Order;
import com.primeiroprojeto.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}

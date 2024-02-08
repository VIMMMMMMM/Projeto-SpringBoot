package com.primeiroprojeto.curso.services;

import com.primeiroprojeto.curso.entities.Order;
import com.primeiroprojeto.curso.repositories.OrderRepository;
import com.primeiroprojeto.curso.repositories.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> optionalUser= repository.findById(id);
        return optionalUser.get();
    }
}
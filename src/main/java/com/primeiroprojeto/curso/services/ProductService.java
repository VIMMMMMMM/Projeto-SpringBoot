package com.primeiroprojeto.curso.services;

import com.primeiroprojeto.curso.entities.Product;
import com.primeiroprojeto.curso.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product>optionalProduct= repository.findById(id);
        return optionalProduct.get();
    }
}

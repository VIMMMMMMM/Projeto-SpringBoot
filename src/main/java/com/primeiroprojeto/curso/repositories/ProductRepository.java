package com.primeiroprojeto.curso.repositories;

import com.primeiroprojeto.curso.entities.Product;
import com.primeiroprojeto.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}

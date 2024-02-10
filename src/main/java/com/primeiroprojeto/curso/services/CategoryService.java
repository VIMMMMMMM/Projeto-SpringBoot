package com.primeiroprojeto.curso.services;

import com.primeiroprojeto.curso.entities.Category;
import com.primeiroprojeto.curso.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
    public Category findById(Long id){
        Optional<Category>optionalCategory= repository.findById(id);
        return optionalCategory.get();
    }
}

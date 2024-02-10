package com.primeiroprojeto.curso.repositories;

import com.primeiroprojeto.curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}

package com.primeiroprojeto.curso.repositories;

import com.primeiroprojeto.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

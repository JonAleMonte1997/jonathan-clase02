package com.desafios.desafio2.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafios.desafio2.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

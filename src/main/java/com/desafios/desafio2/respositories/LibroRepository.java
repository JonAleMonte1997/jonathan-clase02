package com.desafios.desafio2.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafios.desafio2.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}

package com.desafios.desafio2.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafios.desafio2.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}

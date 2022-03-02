package com.desafios.desafio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafios.desafio2.entities.Autor;
import com.desafios.desafio2.entities.Categoria;
import com.desafios.desafio2.entities.Editorial;
import com.desafios.desafio2.entities.Libro;
import com.desafios.desafio2.respositories.AutorRepository;
import com.desafios.desafio2.respositories.CategoriaRepository;
import com.desafios.desafio2.respositories.EditorialRepository;
import com.desafios.desafio2.respositories.LibroRepository;

@SpringBootApplication
public class Desafio2Application implements CommandLineRunner {

	@Autowired
	AutorRepository autorRepository;
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	EditorialRepository editorialRepository;
	
	@Autowired
	LibroRepository libroRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio2Application.class, args);
	}

	public void run(String... args) throws Exception {

		Autor autor;
		
		Editorial editorial;
		
		Categoria categoria;
		
		autor = crearAutor("Clive Staples", "Lewis");
		
		editorial = crearEditorial("Planeta S.A.I.C", "Independencia 1668");
		
		categoria = crearCategoria("Infantil");
		
		crearLibro("Narnia: El león, la bruja y el armario", categoria, autor, editorial);
	}
	
	private Autor crearAutor(String nombre, String apellido) {
		Autor autor = new Autor(nombre, apellido);
		return autorRepository.save(autor);
	}
	
	private Editorial crearEditorial(String nombre, String direccion) {
		Editorial editorial = new Editorial(nombre, direccion);
		return editorialRepository.save(editorial);
	}
	
	private Categoria crearCategoria(String categoriaNombre) {
		Categoria categoria = new Categoria(categoriaNombre);
		return categoriaRepository.save(categoria);
	}
	
	private Libro crearLibro(String titulo, Categoria categoria, Autor autor, Editorial editorial) {
		Libro libro = new Libro(titulo, categoria, autor, editorial);
		return libroRepository.save(libro);
	}
}

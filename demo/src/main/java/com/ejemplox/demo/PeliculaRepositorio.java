package com.ejemplox.demo;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PeliculaRepositorio extends Repository<Pelicula, Integer> {
	List<Pelicula>findAll();
	Pelicula save(Pelicula p);
	Pelicula findById(int id);
	void delete(Pelicula p);

}

package com.ejemplox.demo;

import java.util.List;

public interface PeliculaService {
	List<Pelicula> listar();
	Pelicula agregar(Pelicula p);
	Pelicula listarId(int id);
	Pelicula editar(Pelicula p);
	Pelicula eliminar(int id);

}

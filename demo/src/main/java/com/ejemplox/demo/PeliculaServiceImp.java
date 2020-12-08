package com.ejemplox.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImp implements PeliculaService{
	@Autowired
	private PeliculaRepositorio repositorio;

	@Override
	public List<Pelicula> listar() {
		
		return repositorio.findAll();
	}

	@Override
	public Pelicula agregar(Pelicula p) {
		return repositorio.save(p);
	}

	@Override
	public Pelicula listarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public Pelicula editar(Pelicula p) {
		return repositorio.save(p);	
	}

	@Override
	public Pelicula eliminar(int id) {
		Pelicula p = repositorio.findById(id);
		if (p!=null) {
			repositorio.delete(p);
		}
		return p;
	}

	


	

}

package com.sigarep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigarep.modelo.Material;


public interface IMaterialRepositorio extends JpaRepository<Material,String>{
	
	public Material findByNombre(String nombre);

}

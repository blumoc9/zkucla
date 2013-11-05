package com.sigarep.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sigarep.modelo.Material;
import com.sigarep.repository.IMaterialRepositorio;


@Service("sm")
public class ServicioMaterial {
	
	 @Autowired
	private IMaterialRepositorio mat;
	
	public void guardarMaterial(Material m){
		mat.save(m);
		
	}
	public void eliminarMaterial(Material m){
		mat.delete(m);
	}
	
	public Material BuscarNombre(String nomb){
		return mat.findByNombre(nomb);
	}

}

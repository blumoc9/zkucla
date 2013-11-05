package com.sigarep.viewmodels;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import com.sigarep.modelo.Material;
import com.sigarep.servicios.ServicioMaterial;
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class MaterialViewModels {
	
	@WireVariable
	private ServicioMaterial sm;
	private String nombre;
	private String desp;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	@Command
	public void RegistrarMaterial(){
		Material mater= new Material(nombre,desp);
		sm.guardarMaterial(mater);
	}
	
	
}

package com.sigarep.controlador;

import org.springframework.stereotype.Controller;
import org.zkoss.zhtml.Button;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zul.Textbox;

import com.sigarep.modelo.Profesor;
import com.sigarep.servicios.ServicioProfesor;

//import configuracion.ApplicationContextProvider;

@SuppressWarnings("serial")
@Controller
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class ControladorProfesor extends SelectorComposer<Component> {
	private @WireVariable ServicioProfesor sp;
	private @Wire Textbox txtnombre;
	private @Wire Textbox txtapellido;
	private @Wire Textbox txtemail;
	private @Wire Button btnguardar;

	@Listen("onClick = #btnguardar")
	public void guardar() {
		String nombre = txtnombre.getValue();
		String apellido= txtapellido.getValue();
		String email= txtapellido.getValue();
		Profesor pro = new Profesor(nombre,apellido,email);
		System.out.println("PASE POR LO MENOS");
		sp.guardar(pro);
		txtnombre.setText("");
		txtapellido.setText("");
		txtemail.setText("");
		System.out.println("Listo Guarde!!");
	}
	
}

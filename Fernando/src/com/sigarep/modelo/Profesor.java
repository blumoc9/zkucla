
package com.sigarep.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/* El @Entity anotaci�n indica que el JavaBean es una entidad persistente. 
 * APP conteste autom�ticamente a esta categor�a, excepto la configuraci�n JPA 
 * registra expl�citamente las clases de cada unidad de persistencia debe manejar. 
 * Una @table  anotaci�n puede configurar expl�citamente qu� tabla la entidad se asigna a,
 *  aunque en este caso no es necesario ya que por defecto el nombre de la clase que coincide 
 *  con el nombre de la tabla.
 *  http://es.wikipedia.org/wiki/JavaBean */
@Entity
@Table(name = "profesor")
public class Profesor {
	
	private String nombre;
    private String apellido;
    private String email;
 
	public Profesor(String nombre, String apellido, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	public Profesor() {
	}
	@Id
	@Column(name = "nombre")
     public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name = "apellido")
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}

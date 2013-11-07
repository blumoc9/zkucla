
package com.sigarep.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/* El @Entity anotación indica que el JavaBean es una entidad persistente. 
 * APP conteste automáticamente a esta categoría, excepto la configuración JPA 
 * registra explícitamente las clases de cada unidad de persistencia debe manejar. 
 * Una @table  anotación puede configurar explícitamente qué tabla la entidad se asigna a,
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

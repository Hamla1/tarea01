package com.senati.clase01;

public class Persona {

	String nombre;
	String apellido;
	String correo;
	/**
	 * @param nombre
	 * @param apellido
	 * @param correo
	 */
	public Persona(String nombre, String apellido, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	//agregar el tostring
		@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + "]";
	}
	
	
}

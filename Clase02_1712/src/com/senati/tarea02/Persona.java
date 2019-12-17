package com.senati.tarea02;
public class Persona {
//atributos de la clase
//constructor vacios
//constructores con parametros
//**************** declaracion de atributos ****************//
	String dni;String nombre;String apellido;
	char sexo;
	int edad;
//**************** declaracion del constructor ****************//
	/**
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param sexo
	 */
	public Persona(String dni, String nombre, String apellido, char sexo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}
/**
Constructor vacio
 */
public Persona() {
	super();
}
//
public Persona(Persona p) {
	super();
	this.dni = p.dni;
	this.nombre = p.nombre;
	this.apellido = p.apellido;
	this.sexo = p.sexo;
	this.edad = p.edad;
	
}

//**************** declaracion de getters y setters ****************//
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
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
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
@Override
public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad
			+ "]";
}

//salida 2 del parametro p de la clase Persona

	
}









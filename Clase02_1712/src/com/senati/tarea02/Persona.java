package com.senati.tarea02;

public class Persona {
	//Atributos de la clase: dni, nombre, apellido,sexo
	//Constructores vacio, con parametros
	//Metodo toString()
	
	//-------------- Declaracion de los atributos ------------ // 
	String dni;
	String nombre;
	String apellido;
	char sexo;
	
	
	
	//------------- Declaracion de los constructores --------- //
	public Persona(String dni, String nombre, String apellido, char sexo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}

	public Persona() {
		super();
	}

	//---------- Declarar los Getters y Setters -------- //
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

	// ------- Metodo toString() ---------------//
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + "]";
	}
	
	
}

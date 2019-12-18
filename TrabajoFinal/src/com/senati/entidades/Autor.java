package com.senati.entidades;

public class Autor {
protected String Cedula;
private String Nombre;
/**
 * @param cedula
 * @param nombre
 */
public Autor(String cedula, String nombre) {
	super();
	Cedula = cedula;
	Nombre = nombre;
}
/**
 * 
 */
public Autor() {
	super();
}
public String getCedula() {
	return Cedula;
}
public void setCedula(String cedula) {
	Cedula = cedula;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
@Override
public String toString() {
	return "Autor [Cedula=" + Cedula + ", Nombre=" + Nombre + "]";
}

//


	
	
	
	
	
	
}

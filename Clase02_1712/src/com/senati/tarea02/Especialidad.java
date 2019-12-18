package com.senati.tarea02;
public class Especialidad {
	
	String idEspecialidad;
	String Nombre;
	public Especialidad(String idEspecialidad, String nombre) {
		super();
		this.idEspecialidad = idEspecialidad;
		Nombre = nombre;
	}
	public String getIdEspecialidad() {
		return idEspecialidad;
	}
	public void setIdEspecialidad(String idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Especialidad [idEspecialidad=   " + idEspecialidad + ", Nombre= " + Nombre + "]";
	}
	public void a() {
		
	}
	public void a(int a) {
		
	}
	
	
}

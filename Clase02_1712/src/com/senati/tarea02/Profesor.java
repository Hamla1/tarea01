package com.senati.tarea02;

public class Profesor extends Persona{
	String idProfesor;
	String idEspecialidad;
	public Profesor(String dni, String nombre, String apellido, char sexo, String idProfesor, String idEspecialidad) {
		super(dni, nombre, apellido, sexo);
		this.idProfesor = idProfesor;
		this.idEspecialidad = idEspecialidad;
	}
	
	public Profesor(String dni, String nombre, String apellido, char sexo) {
		super(dni, nombre, apellido, sexo);
	}

	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getIdEspecialidad() {
		return idEspecialidad;
	}
	public void setIdEspecialidad(String idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", idEspecialidad=" + idEspecialidad + ", dni=" + dni
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + "]";
	}
	
	
}

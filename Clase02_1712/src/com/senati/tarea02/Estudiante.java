package com.senati.tarea02;
public class Estudiante extends Persona {
	String NroMatricula;
	String Apoderado;
	String Parentesco;
	public Estudiante(String dni, String nombre, String apellido, char sexo, String nroMatricula, String apoderado,
			String parentesco) {
		super(dni, nombre, apellido, sexo);
		NroMatricula = nroMatricula;
		Apoderado = apoderado;
		Parentesco = parentesco;
	}
	public String getNroMatricula() {
		return NroMatricula;
	}
	public void setNroMatricula(String nroMatricula) {
		NroMatricula = nroMatricula;
	}
	public String getApoderado() {
		return Apoderado;
	}
	public void setApoderado(String apoderado) {
		Apoderado = apoderado;
	}
	public String getParentesco() {
		return Parentesco;
	}
	public void setParentesco(String parentesco) {
		Parentesco = parentesco;
	}
	@Override
	public String toString() {
		return "Estudiante [NroMatricula=" + NroMatricula + ", Apoderado=" + Apoderado + ", Parentesco=" + Parentesco
				+ ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + "]";
	}
	
	public String NombresCompleto() {
		return nombre + " " + apellido;
	}
}

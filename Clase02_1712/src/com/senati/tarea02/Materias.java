package com.senati.tarea02;

public class Materias extends Especialidad{

	String nombre;
	int horas;
		
	public Materias(String idEspecialidad, String nombre) {
		super(idEspecialidad, nombre);
		// TODO Auto-generated constructor stub
	}
//cosntructor

	/**
	 * @param idEspecialidad
	 * @param nombre
	 * @param nombre2
	 * @param horas
	 */
	public Materias(String idEspecialidad, String nombre2, int horas) {
		super(idEspecialidad, nombre2);
		this.idEspecialidad=idEspecialidad;
		this.nombre =nombre2;
		this.horas =  horas;
	}
	//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	//

	@Override
	public String toString() {
		return "Materias [nombre=" + nombre + ", horas=" + horas + "]";
	}
	
	public void mostrarmateria() {
		System.out.println("Id ->"  + this.idEspecialidad + "\n" + 
							"Materia -> " +  this.nombre + "\n" + 
							"Horas ->" + this.horas);
	}
	
	
	
}

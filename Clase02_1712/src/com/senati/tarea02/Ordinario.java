package com.senati.tarea02;

public class Ordinario extends Profesor {
	int TiempoServicio;

	public Ordinario(String dni, String nombre, String apellido, char sexo, String idProfesor, String idEspecialidad,
			int TiempoServicio) {
		super(dni, nombre, apellido, sexo, idProfesor, idEspecialidad);
		TiempoServicio = TiempoServicio;
	}

	public int getTiempoServicio() {
		return TiempoServicio;
	}

	public void setTiempoServicio(int tiempoServicio) {
		TiempoServicio = tiempoServicio;
	}

	@Override
	public String toString() {
		return "Ordinario [TiempoServicio=" + TiempoServicio + ", idProfesor=" + idProfesor + ", idEspecialidad="
				+ idEspecialidad + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo
				+ "]";
	}
	
	
}

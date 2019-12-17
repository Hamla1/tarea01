package com.senati.tarea02;

public class AppEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante estudiante1 = new Estudiante("25782211","Jorge","Luque",'M',"201901","Freddy Luque","Padre");
		Estudiante estudiante2 = new Estudiante("25782222","Carlos","Pardo",'M',"201902","Alicia Pardo","Madre");
		System.out.println(estudiante1.toString());
		System.out.println(estudiante2.toString());
		System.out.println(estudiante1.NombresCompleto());
		System.out.println(estudiante2.NombresCompleto());
	}

}

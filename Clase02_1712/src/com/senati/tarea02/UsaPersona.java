package com.senati.tarea02;

public class UsaPersona {

public static void main(String[] args) {
	//crear objeto estudiante a partir de la clase persona
	//Parte 01 con el constructor con parametros
	//Persona objper  = new Persona("08154647","Hugo","Mamanchura",'M');
	//System.out.println(objper.toString());
	
	//Parte 02 con el constructor sin parametros - utilizando los setters
	Persona objper  = new Persona();
	objper.setDni("08154647");
	objper.setNombre("Hugo");
	objper.setApellido("Mamanchura");
	objper.setSexo('M');
	System.out.println(objper.toString());
	
	
	
	

	}
}

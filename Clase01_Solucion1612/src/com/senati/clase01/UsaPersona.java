package com.senati.clase01;

public class UsaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona objper = new Persona("","","");
		
		objper.nombre = "Hugo";
		objper.apellido ="Mamanchura";
		objper.correo = "hamla1@hotmail.com";
		
		System.out.println(objper.toString());
		
		
	}

}

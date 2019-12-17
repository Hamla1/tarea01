package com.senati.tarea02;

public class UsaArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articulo objart = new Articulo("A01", "Refrigeradora 15 Pulg", "Lg", 1500);
		System.out.println(objart.toString());
		System.out.println("************************");
		System.out.println(objart.valores());
		
	}

}

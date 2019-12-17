package com.senati.tarea01;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	//AUTOR : HUGO MAMANCHURA LIMA
	public static void main(String[] args) {
		float sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese sueldo:"));
		
		float nuevo_sueldo = sueldo * 1.25f;
		
		float seguro = nuevo_sueldo * 0.05f;
		
		System.out.println("Sueldo anterior : " + sueldo);
		System.out.println("Sueldo nuevo    : " + nuevo_sueldo);
		System.out.println("Seguro          : " + seguro);
		System.out.println("Sueldo neto     : " + (nuevo_sueldo - seguro));
	}
}



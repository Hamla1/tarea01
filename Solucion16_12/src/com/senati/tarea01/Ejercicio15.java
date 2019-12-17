package com.senati.tarea01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio15 {
	//AUTOR : HUGO MAMANCHURA LIMA
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		
		float haber = Float.parseFloat(JOptionPane.showInputDialog("Ingrese haber básico: "));
		byte faltas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese número de faltas: "));
				
		float dscto = (float) ((faltas >= 2) ? 0.05 : 0) * haber;
		
		System.out.println("Haber básico : " + df.format(haber));
		System.out.println("Descuento    : " + df.format(dscto));
		System.out.println("Haber final  : " + df.format(haber - dscto));
	}
}



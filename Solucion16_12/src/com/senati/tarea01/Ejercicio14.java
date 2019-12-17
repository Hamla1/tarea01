package com.senati.tarea01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio14 {
	//AUTOR : HUGO MAMANCHURA LIMA
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
				
		float monto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese monto de compra: "));
		
		float dscto = (float) ((monto > 3000) ? 0.3 : 0.2) * monto;
		
		System.out.println("Monto de compra: " + df.format(monto));
		System.out.println("Descuento      : " + df.format(dscto));
		System.out.println("Monto final    : " + df.format(monto - dscto));		
	}
}


package com.senati.tarea02;

import java.util.Scanner;

public class Arreglo1 {

	public static void main(String[] args) {
		
		
		int[] numeros = {1,5,-15,5,0,5,25};
		Scanner obtenerNumero = new Scanner(System.in);
		int max, min;
 		min=max=numeros[0];
 		for(int i = 0; i < numeros.length; i++)
		{
			if(	min>numeros[i]){
				min=numeros[i];
			}if(max<numeros[i]){
				max=numeros[i];
			}
			
		}
 		int dif = max  - min ;
 		System.out.println("El máximo es " + max + " y el minimo es " + min + "Diferecia :" + dif);

	}

}

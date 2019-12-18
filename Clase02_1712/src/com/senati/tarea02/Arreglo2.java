package com.senati.tarea02;

import java.util.Scanner;

public class Arreglo2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0; //contadores
        int i=0;
        int max, min,dif=0;
        //Leemos los valores por teclado y los guardamos en el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        //se recorre el array para contar positivos, negativos y ceros
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
 		min=max=numeros[0];
 		for(i = 0; i < numeros.length; i++)
		{
			if(	min>numeros[i]){
				min=numeros[i];
			}if(max<numeros[i]){
				max=numeros[i];
			}
		
		}
 		//int dif = max  - min ;
 		System.out.println("El máximo es " + max + " y el minimo es : " + min + " Diferecia :" );
        
        
        
        
        //mostrar resultados
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);

	}

}

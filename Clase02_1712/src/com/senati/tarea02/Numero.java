package com.senati.tarea02;

public class Numero {

	public double Num;
	//

	public Numero(double num) {
		//super();
		this.Num = num;
	}
	
	public String ver_posneg() {
		String rpta=null;
		if (Num < 0 ) {
			rpta = "ES NEGATIVO";
		}else {
			rpta = "ES POSITIVO";
		}
		return rpta;
	}
	
	public void  ver_fibonacci() {
		int num1=0 ; int num2= 1; int suma=1;
		System.out.println("Fibonacci de  : " + this.Num + ":  ");
		for (int i = 0; i < Num; i++) {
			System.out.print(("+" + suma)); 
			suma = num1 + num2;  
			num1 = num2;
			num2 = suma;
		  
	    }
		System.out.println();
	}

	public double getNum() {
		return Num;
	}


	public void setNum(double num) {
		Num = num;
	}
	
	
	
	
}

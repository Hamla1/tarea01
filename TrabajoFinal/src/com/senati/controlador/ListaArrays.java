package com.senati.controlador;
import com.senati.entidades.Autor;

public class ListaArrays {
private Autor[] lista;
private final int MAX = 100;
private int N;
/**
 * 
 */
public ListaArrays() {
	lista  = new Autor[MAX];
	N=0;
}
public void Add(Autor p) {
	lista[N] = p;
	N=N+1;
}

public void Edit(Autor p, int pos) {
	lista[pos] = p;
	
}

public void Delete(int pos) {
	for(int i=pos ; i<N-1;i++) {
		lista[i] = lista[i+1];
	}
	N=N-1;
}
public int  Buscar(String  ced) {
	int pos=-1;
	for(int i=0 ; i<N;i++) {
		if (lista[i].getCedula().equals(ced)) {
			pos=i;
		}
	}
	return pos;
}
public void ImprimirLista() {
	for(int i=0 ;i<N;i++) {
		System.out.println(lista[i].toString());
	}
}
public Autor get_autor(int pos) {
	if(pos>=0 && pos <N) {
		return lista[pos];
	}else {
		return null;
	}
}

public int Count() {
	return N;
}




}

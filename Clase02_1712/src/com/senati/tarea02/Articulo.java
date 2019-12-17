package com.senati.tarea02;

public class Articulo {
	//atributos
	String codigo;String descripcion ; String marca;
	float precio;
	//metodos
	/**
	 * @param codigo
	 * @param descripcion
	 * @param marca
	 * @param precio
	 */
	public Articulo(String codigo, String descripcion, String marca, float precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
	}
	//getters y setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	//metodo tostring
	@Override
	public String toString() {
		return 	"codigo = " + codigo + "\n" +
				"descripcion = " + descripcion + "\n" + 
				"Marca = " + marca + "\n" + 
				"Precio =" + precio;
	}
	
	public String valores() {
		return 	
				"descripcion = " + descripcion + "\n" + 
				"Marca = " + marca ; 
			
	}
	
	

}

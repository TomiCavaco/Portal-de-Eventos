package com.portal;


public class Categoria {

	private int categoria;
	private String nombre;

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria(int categoria, String nombre) {
		super();
		this.categoria = categoria;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + categoria + ", nombre=" + nombre + "]";
	}

}

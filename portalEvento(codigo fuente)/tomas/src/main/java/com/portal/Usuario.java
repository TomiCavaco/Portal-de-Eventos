package com.portal;

public class Usuario {

	private int usuario;
	private String nombre;
	private String correo;
	private String contrasena;

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int idUsuario) {
		this.usuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Usuario(int usuario, String nombre, String correo, String contrasena) {
		this.usuario = usuario;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
	}

}
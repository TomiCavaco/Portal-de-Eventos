package com.portal;


public class Organizador {

    private int organizador;
    private String nombre;
    private String correoContacto;
    private String telefono;

    public int getOrganizador() {
        return organizador;
    }

    public void setOrganizador(int oganizador) {
        this.organizador = oganizador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Organizador(int organizador, String nombre, String correoContacto, String telefono) {
        super();
        this.organizador = organizador;
        this.nombre = nombre;
        this.correoContacto = correoContacto;
        this.telefono = telefono;
    }

}

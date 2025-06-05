package com.portal;


public class Ubicacion {

    private int ubicacion;
    private String tipo;
    private String direccion;
    private String ciudad;

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Ubicacion(int ubicacion, String tipo, String direccion, String ciudad) {
        super();
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

}
package com.portal;


import java.time.LocalDateTime;

public class Evento {

    private int evento;
    private String nombre;
    private LocalDateTime fecha;
    private int duracion;
    private int ubicacion;
    private int categoria;
    private int organizador;
    private String estado;

    public int getIdEvento() {
        return evento;
    }

    public void setIdEvento(int idEvento) {
        this.evento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getOrganizador() {
        return organizador;
    }

    public void setOrganizador(int organizador) {
        this.organizador = organizador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Evento(int evento, String nombre, LocalDateTime fecha, int duracion, int ubicacion, int categoria,
            int organizador, String estado) {
        super();
        this.evento = evento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.ubicacion = ubicacion;
        this.categoria = categoria;
        this.organizador = organizador;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Evento [id=" + evento + ", nombre=" + nombre + ", fecha=" + fecha +
                ", duracion=" + duracion + ", ubicacion=" + ubicacion +
                ", categoria=" + categoria + ", organizador=" + organizador +
                ", estado=" + estado + "]";
    }

}
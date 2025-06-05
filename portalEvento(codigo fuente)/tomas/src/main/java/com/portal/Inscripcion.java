package com.portal;


import java.time.LocalDateTime;

public class Inscripcion {

    private int inscripcion;
    private int usuario;
    private int evento;
    private LocalDateTime fechaInscripcion;
    
    public int getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(int inscripcion) {
        this.inscripcion = inscripcion;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getEvento() {
        return evento;
    }

    public void setEvento(int evento) {
        this.evento = evento;
    }

    public LocalDateTime getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDateTime fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
        
    public Inscripcion(int inscripcion, int usuario, int evento, LocalDateTime fechaInscripcion) {
        this.inscripcion = inscripcion;
        this.usuario = usuario;
        this.evento = evento;
        this.fechaInscripcion = fechaInscripcion;
    }
}

package com.portal;

import java.time.LocalDateTime;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        GestionEventos gestor = new GestionEventos();

        gestor.agregarCategoria(new Categoria(1, "Conferencia"));

        gestor.agregarUbicacion(new Ubicacion(1, "presencial", "Indra, Malga", "Málaga"));

        gestor.agregarOrganizador(new Organizador(1, "Indra", "contacto@indra.com", "123456789"));

        gestor.agregarEvento(new Evento(1, "Conferencia sobre Cambio Climático", LocalDateTime.of(2025, 6, 14, 20, 0),
                120, 1, 1, 1, "activo"));

        gestor.agregarUsuario(new Usuario(1, "Leandro Paredes", "leo@escaloneta.com", "contraseña123"));

        boolean inscrito = gestor.inscribirUsuario(1, 1);
        System.out.println(
                "Usuario inscrito a la Conferencia sobre Cambio Climático: " + (inscrito ? "Éxito" : "Fallido"));

        System.out.println("Eventos de Sostenibilidad:");
        ArrayList<Evento> eventosSostenibilidad = gestor.eventosPorCategoria(3);
        for (int i = 0; i < eventosSostenibilidad.size(); i++) {
            System.out.println(
                    eventosSostenibilidad.get(i).getNombre() + " (" + eventosSostenibilidad.get(i).getFecha() + ")");
        }

        Evento evento = gestor.eventoPorId(1);
        if (evento != null) {
            Categoria categoria = gestor.getCategoriaPorId(evento.getCategoria());
            Ubicacion ubicacion = gestor.getUbicacionPorId(evento.getUbicacion());
            Organizador organizador = gestor.getOrganizadorPorId(evento.getOrganizador());
            System.out.println("\nDetalles del evento:");
            System.out.println("Nombre: " + evento.getNombre());
            System.out.println("Fecha: " + evento.getFecha());
            System.out.println("Ubicación: " + ubicacion.getDireccion() + ", " + ubicacion.getCiudad());
            System.out.println("Categoría: " + categoria.getNombre());
            System.out.println("Organizador: " + organizador.getNombre());
            System.out.println("Estado: " + evento.getEstado());
        }
    }
}
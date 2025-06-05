package com.portal;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class GestionEventos {
    private ArrayList<Evento> eventos;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Organizador> organizadores;
    private ArrayList<Categoria> categorias;
    private ArrayList<Inscripcion> inscripciones;
    private ArrayList<Ubicacion> ubicaciones;

    public GestionEventos() {
        eventos = new ArrayList<>();
        usuarios = new ArrayList<>();
        organizadores = new ArrayList<>();
        categorias = new ArrayList<>();
        inscripciones = new ArrayList<>();
        ubicaciones = new ArrayList<>();
    }

    // Agregamos todos los datos necesarios
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void agregarOrganizador(Organizador organizador) {
        organizadores.add(organizador);
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
    }

    public void agregarUbicacion(Ubicacion ubicacion) {
        ubicaciones.add(ubicacion);
    }

    // Métodos para obtener datos
    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    // Busca y muestra la categoria buscada
    public ArrayList<Evento> eventosPorCategoria(int categoria) {
        // creamos una nueva lista para almacenar la categoria
        ArrayList<Evento> resultado = new ArrayList<>();
        for (int i = 0; i < eventos.size(); i++) {
            // validamos y añadimos a la nueva lista
            if (eventos.get(i).getCategoria() == categoria) {
                resultado.add(eventos.get(i));
            }
        }
        return resultado;
    }

    // buscamos el id del evento
    public Evento eventoPorId(int evento) {
        // recorremos la lista
        for (int i = 0; i < eventos.size(); i++) {
            // validamos, cuando el id del evento introducido se igual a de la lista
            if (eventos.get(i).getIdEvento() == evento) {
                // lo retorna
                return eventos.get(i);
            }
        }
        // si no lo encontra devuelve null
        return null;
    }

    // buscamos el id de la categoria
    public Categoria getCategoriaPorId(int idCategoria) {
        // recorremos la lista
        for (int i = 0; i < categorias.size(); i++) {
            // validamos
            if (categorias.get(i).getCategoria() == idCategoria) {
                // retorna en caso de ser encontrado
                return categorias.get(i);
            }
        }
        return null;
    }

    // buscamos el id de la ubucacion
    public Ubicacion getUbicacionPorId(int idUbicacion) {
        for (int i = 0; i < ubicaciones.size(); i++) {
            if (ubicaciones.get(i).getUbicacion() == idUbicacion) {
                return ubicaciones.get(i);
            }
        }
        return null;
    }

    // buscamos el id del organizador
    public Organizador getOrganizadorPorId(int idOrganizador) {
        for (int i = 0; i < organizadores.size(); i++) {
            if (organizadores.get(i).getOrganizador() == idOrganizador) {
                return organizadores.get(i);
            }
        }
        return null;
    }

    // en ete metodo inscribimos a los usuarios
    public boolean inscribirUsuario(int idUsuario, int idEvento) {
        for (int i = 0; i < inscripciones.size(); i++) {
            // validamos si el usuario ya está inscrito en el evento
            if (inscripciones.get(i).getEvento() == idEvento) {
                return false; // el usuario ya inscrito en el evento
            }
        }
        // si no estra incrito, creamos una nueva lsita
        Inscripcion inscripcion = new Inscripcion(inscripciones.size() + 1, idUsuario, idEvento, LocalDateTime.now());
        inscripciones.add(inscripcion);
        return true;
    }

    //
    public boolean cancelarInscripcion(int idUsuario, int idEvento) {
        for (int i = 0; i < inscripciones.size(); i++) {
            if (inscripciones.get(i).getUsuario() == idUsuario && inscripciones.get(i).getEvento() == idEvento) {
                inscripciones.remove(i);
                return true;
            }
        }
        return false;
    }
}
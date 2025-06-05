Portal de Eventos Sostenibles
Introducción
DESCRIPCIÓN GENERAL
El Portal de Eventos Sostenibles es una app web para promover eventos de sostenibilidad. Los usuarios exploran eventos destacados en un carrusel, los filtran por categorías (conferencias, talleres, actividades ambientales) y ven detalles como fechas y ubicaciones. El frontend usa HTML, CSS y JavaScript; el backend, Java; y MySQL almacena datos (sin conexión directa en esta versión). Tecnologías Usadas

Frontend:
HTML : Estructura las páginas (index.html, eventos.html, detalleCambioClimatico.html, detalleReforestacion.html, detalleEconomiaCircular.html). CSS: Estiliza con css/styles.css (página principal) y css/stylesEventos.css (eventos). Incluye carrusel, efectos (glow-border) y cuadrícula (categorias-grid). JavaScript: js/carousel.js para el carrusel interactivo.

Backend:
Java: Clases como GestionEventos y Main para gestionar eventos y usuarios. MySQL : Base de datos para eventos, usuarios y más.

Imágenes: En img/ (ej. accion (1).jpg).

Modelo
Modelo de Base de Datos
La base de datos portal_eventos en MySQL tiene estas tablas:

categoria : Categorías (Taller, Conferencia, Sostenibilidad). Campos: id_categoria, nombre. ubicacion : Ubicaciones. Campos: id_ubicacion, tipo (presencial/en_linea), direccion, ciudad. organizador : Organizadores. Campos: id_organizador, nombre, correo_contacto, telefono. **usuario **: Usuarios. Campos: id_usuario, nombre, correo, contrasena. evento : Eventos. Campos: id_evento, nombre, fecha, duracion, id_ubicacion, id_categoria, id_organizador, estado. inscripcion : Inscripciones. Campos: id_inscripcion, id_usuario, id_evento, fecha_inscripcion.

HTML y CSS
HTML :
index.html : Página principal con carrusel (ej. Conferencia sobre Cambio Climático) y categorías. **eventos.html **: Lista eventos (fecha, ubicación: Indra, Málaga; precios: desde 35€). detalleCambioClimatico.html, detalleReforestacion.html, detalleEconomiaCircular.html: Detalles de eventos.

CSS :
css/styles.css : Estilos del carrusel y categorías en index.html. css/stylesEventos.css : Estiliza eventos.html y páginas de detalles con diseño limpio.
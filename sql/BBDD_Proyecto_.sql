
CREATE DATABASE portal_eventos;
USE portal_eventos;

CREATE TABLE categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) 
);


CREATE TABLE ubicacion (
    id_ubicacion INT AUTO_INCREMENT PRIMARY KEY,
    tipo ENUM('presencial', 'en_linea'),
    direccion VARCHAR(255),
    ciudad VARCHAR(100)
);


CREATE TABLE organizador (
    id_organizador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    correo_contacto VARCHAR(100),
    telefono VARCHAR(20)
);


CREATE TABLE usuario (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    correo VARCHAR(100),
    contrasena VARCHAR(255)
);


CREATE TABLE evento (
    id_evento INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    fecha DATETIME,
    duracion INT,
    id_ubicacion INT,
    id_categoria INT,
    id_organizador INT,
    estado ENUM('activo', 'cancelado', 'finalizado') DEFAULT 'activo',
    FOREIGN KEY (id_ubicacion) REFERENCES ubicacion(id_ubicacion),
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria),
    FOREIGN KEY (id_organizador) REFERENCES organizador(id_organizador)
);


CREATE TABLE inscripcion (
    id_inscripcion INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_evento INT NOT NULL,
    fecha_inscripcion DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    FOREIGN KEY (id_evento) REFERENCES evento(id_evento),
    UNIQUE (id_usuario, id_evento)
);

INSERT INTO categoria (nombre) VALUES ('Taller'), ('Conferencia'), ('Sostenibilidad');
INSERT INTO ubicacion (tipo, direccion, ciudad) VALUES ('presencial', 'Indra, Málaga', 'Málaga'), ('en_linea', 'https://zoom.us/evento123', NULL);
INSERT INTO organizador (nombre, correo_contacto, telefono) VALUES ('Indra', 'contacto@indra.es', '123456789');
INSERT INTO usuario (nombre, correo, contrasena) VALUES ('Juan Pérez', 'juan@example.com', 'bcrypt_hash_ejemplo');
INSERT INTO evento (nombre, fecha, duracion, id_ubicacion, id_categoria, id_organizador, estado) 
VALUES ('Taller PHP', '2025-06-14 20:00:00', 120, 1, 1, 1, 'activo');
INSERT INTO inscripcion (id_usuario, id_evento, fecha_inscripcion) VALUES (1, 1, CURRENT_TIMESTAMP);

SET FOREIGN_KEY_CHECKS=0;
TRUNCATE TABLE partido;
TRUNCATE TABLE jugador;
TRUNCATE TABLE equipo;
TRUNCATE TABLE club;
SET FOREIGN_KEY_CHECKS=1;

-- CLUBES (6 distintos)
INSERT INTO club (nombre, ciudad, fundacion) VALUES
('Innovation FC',          'Bucaramanga', 2001),
('Transpiedecuesta FC',    'Piedecuesta', 1998),
('Atlético Chicamocha',    'Duitama',     1986),
('Metropolitano Norte',    'Floridablanca', 2005),
('Real Lebrija',           'Lebrija',     1979),
('Unión Rionegro',         'Rionegro',    1992);

-- EQUIPOS (por club)
-- Nota: asumo IDs secuenciales 1..6 tal como arriba
INSERT INTO equipo (nombre, categoria, club_id) VALUES
('Profesional', 'Profesional', 1),
('Sub-20',      'Juvenil',     1),
('Profesional', 'Profesional', 2),
('Sub-17',      'Juvenil',     2),
('Profesional', 'Profesional', 3),
('Profesional', 'Profesional', 4),
('Profesional', 'Profesional', 5),
('Profesional', 'Profesional', 6);

-- JUGADORES (muestra)
INSERT INTO jugador (nombre, dorsal, posicion, equipo_id) VALUES
('Carlos Díaz',    9,  'Delantero', 1),
('Luis Moreno',    10, 'Mediocentro', 1),
('J. Pérez',       1,  'Portero',   1),
('A. Rojas',       7,  'Extremo',   2),
('Mateo Ruiz',     9,  'Delantero', 3),
('S. Hernández',   4,  'Defensa',   3),
('J. Restrepo',    10, 'Mediapunta',5);

-- PARTIDOS (fechas variadas)
-- local_id y visitante_id apuntan a equipo.id
INSERT INTO partido (fecha, estadio, local_id, visitante_id, goles_local, goles_visitante) VALUES
('2025-01-10 18:00:00', 'Álvaro Gómez',      1, 3, 2, 1),
('2025-01-24 16:00:00', 'La Independencia',  5, 1, 0, 0),
('2025-02-03 19:30:00', 'Metropolitano',     6, 7, 1, 3);

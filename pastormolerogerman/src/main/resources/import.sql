-- Paso 1: Insertar Clases SIN profesor (para evitar referencia circular)
INSERT INTO clases (id, nombre_clase) VALUES (1, 'Sala de Bebés');
INSERT INTO clases (id, nombre_clase) VALUES (2, 'Sala de Gateadores');
INSERT INTO clases (id, nombre_clase) VALUES (3, 'Sala de Exploradores');
INSERT INTO clases (id, nombre_clase) VALUES (4, 'Sala de Preescolar A');
INSERT INTO clases (id, nombre_clase) VALUES (5, 'Sala de Preescolar B');

ALTER TABLE clases ALTER COLUMN id RESTART WITH 6;

-- Paso 2: Insertar Profesores (ahora las clases ya existen)
INSERT INTO profesores (id, nombre_profesor, apellido_profesor, email, telefono, dni, nuss, sueldo, fecha_nacimiento, foto_profesor, clases_id) VALUES (100, 'Laura', 'Sánchez Morales', 'laura.sanchez@guarderia.com', 612345678, '12345678A', 123456789012, 1800.00, '1990-03-15', 'https://randomuser.me/api/portraits/women/10.jpg', 1);

INSERT INTO profesores (id, nombre_profesor, apellido_profesor, email, telefono, dni, nuss, sueldo, fecha_nacimiento, foto_profesor, clases_id) VALUES (2, 'Carmen', 'López Jiménez', 'carmen.lopez@guarderia.com', 623456789, '23456789B', 234567890123, 1850.00, '1988-07-22', 'https://randomuser.me/api/portraits/women/11.jpg', 2);

INSERT INTO profesores (id, nombre_profesor, apellido_profesor, email, telefono, dni, nuss, sueldo, fecha_nacimiento, foto_profesor, clases_id) VALUES (3, 'Isabel', 'Martín Torres', 'isabel.martin@guarderia.com', 634567890, '34567890C', 345678901234, 1900.00, '1985-11-08', 'https://randomuser.me/api/portraits/women/12.jpg', 3);

INSERT INTO profesores (id, nombre_profesor, apellido_profesor, email, telefono, dni, nuss, sueldo, fecha_nacimiento, foto_profesor, clases_id) VALUES (4, 'Rosa', 'García Ruiz', 'rosa.garcia@guarderia.com', 645678901, '45678901D', 456789012345, 1950.00, '1992-05-30', 'https://randomuser.me/api/portraits/women/13.jpg', 4);

INSERT INTO profesores (id, nombre_profesor, apellido_profesor, email, telefono, dni, nuss, sueldo, fecha_nacimiento, foto_profesor, clases_id) VALUES (5, 'Elena', 'Hernández Vega', 'elena.hernandez@guarderia.com', 656789012, '56789012E', 567890123456, 2000.00, '1989-09-12', 'https://randomuser.me/api/portraits/women/14.jpg', 5);

ALTER TABLE profesores ALTER COLUMN id RESTART WITH 6;


-- Insertar Alumnos (10 alumnos)
INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (1, 'Sofía', 'Gómez Fernández', 'antonio.gomez@email.com', 611223344, '11223344A', 'https://ui-avatars.com/api/?name=Sofia+G&background=FFB6C1&color=fff&size=150&bold=true', '2023-05-10', 'Lactosa', 1);

INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (2, 'Lucas', 'Rodríguez Moreno', 'miguel.rodriguez@email.com', 633445566, '22334455B', 'https://ui-avatars.com/api/?name=Lucas+R&background=87CEEB&color=fff&size=150&bold=true', '2022-08-15', NULL, 2);

INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (3, 'Emma', 'Álvarez Navarro', 'javier.alvarez@email.com', 655667788, '33445566C', 'https://ui-avatars.com/api/?name=Emma+A&background=DDA0DD&color=fff&size=150&bold=true', '2021-11-22', 'Frutos secos', 3);

INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (4, 'Hugo', 'Gómez Fernández', 'antonio.gomez@email.com', 611223344, '44556677D', 'https://ui-avatars.com/api/?name=Hugo+G&background=90EE90&color=fff&size=150&bold=true', '2020-03-08', NULL, 4);

INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (5, 'Martina', 'Rodríguez Moreno', 'miguel.rodriguez@email.com', 633445566, '55667788E', 'https://ui-avatars.com/api/?name=Martina+R&background=F0E68C&color=fff&size=150&bold=true', '2019-06-30', 'Gluten', 5);

INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (6, 'Daniel', 'Álvarez Navarro', 'javier.alvarez@email.com', 655667788, '66778899F', 'https://ui-avatars.com/api/?name=Daniel+A&background=FFA07A&color=fff&size=150&bold=true', '2023-01-12', NULL, 1);

INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (7, 'Valeria', 'Pérez Silva', 'lucia.fernandez@email.com', 622334455, '77889900A', 'https://ui-avatars.com/api/?name=Valeria+P&background=FF69B4&color=fff&size=150&bold=true', '2022-04-20', 'Polen', 2);

INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (8, 'Mateo', 'Castro Blanco', 'patricia.moreno@email.com', 644556677, '88990011B', 'https://ui-avatars.com/api/?name=Mateo+C&background=ADD8E6&color=fff&size=150&bold=true', '2021-09-05', NULL, 3);

INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (9, 'Paula', 'Jiménez Ortiz', 'cristina.navarro@email.com', 666778899, '99001122C', 'https://ui-avatars.com/api/?name=Paula+J&background=E6E6FA&color=fff&size=150&bold=true', '2020-12-18', 'Huevo', 4);

INSERT INTO alumnos (id, nombre_alumno, apellido_alumno, email_contacto, telefono_contacto, dni, foto_alumno, fecha_nacimiento, alergias, clases_id) VALUES (10, 'Diego', 'Ramos Gil', 'antonio.gomez@email.com', 611223344, '00112233D', 'https://ui-avatars.com/api/?name=Diego+R&background=98FB98&color=fff&size=150&bold=true', '2019-08-25', NULL, 5);

ALTER TABLE alumnos ALTER COLUMN id RESTART WITH 11;

-- Insertar Incidencias (5 incidencias)
INSERT INTO incidencias (id, fecha, descripcion, gravedad, resuelta, observaciones_resolucion) VALUES (1, '2024-01-15', 'Sofía tuvo una pequeña caída en el patio', 'Leve', true, 'Se aplicó hielo y se avisó a los padres. Sin consecuencias.');

INSERT INTO incidencias (id, fecha, descripcion, gravedad, resuelta, observaciones_resolucion) VALUES (2, '2024-01-16', 'Lucas presentó reacción alérgica leve durante la merienda', 'Moderada', true, 'Se administró antihistamínico y se contactó con los padres inmediatamente.');

INSERT INTO incidencias (id, fecha, descripcion, gravedad, resuelta, observaciones_resolucion) VALUES (3, '2024-01-17', 'Discusión entre Hugo y Mateo durante el juego libre', 'Leve', true, 'Se habló con ambos niños. Pidieron disculpas mutuamente.');

INSERT INTO incidencias (id, fecha, descripcion, gravedad, resuelta, observaciones_resolucion) VALUES (4, '2024-01-18', 'Emma se sintió mareada después de la actividad física', 'Moderada', true, 'Se le dio agua y descanso. Los padres fueron notificados.');

INSERT INTO incidencias (id, fecha, descripcion, gravedad, resuelta, observaciones_resolucion) VALUES (5, '2024-01-19', 'Calefacción averiada en Sala de Preescolar B', 'Grave', false, 'Se ha contactado con mantenimiento. Pendiente de reparación.');

ALTER TABLE incidencias ALTER COLUMN id RESTART WITH 6;

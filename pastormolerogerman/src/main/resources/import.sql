INSERT INTO PROFESORES (ID, FECHA_NACIMIENTO, SUELDO, CLASES_ID, NUSS, TELEFONO, APELLIDO_PROFESOR, DNI, EMAIL, FOTO_PROFESOR, NOMBRE_PROFESOR) VALUES (1, '1985-06-12', 2200.50, NULL, '12345678', '600123456', 'González', '12345678A', 'maria.gonzalez@example.com', 'https://api.buscatuprofesor.es/tutor_avatar/kh/Ej/avatar/khEjplFbIlBk90ls2cZwR3zGtk4WNhKoJDRriDx6.jpg', 'María');
INSERT INTO PROFESORES (ID, FECHA_NACIMIENTO, SUELDO, CLASES_ID, NUSS, TELEFONO, APELLIDO_PROFESOR, DNI, EMAIL, FOTO_PROFESOR, NOMBRE_PROFESOR) VALUES (2, '1990-02-20', 2100.00, NULL, '87654321', '600987654', 'Ramírez', '23456789B', 'carlos.ramirez@example.com', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvh6um8V55FQX7qsodoYAtBM9lYS_4KCjYA5PvbfcuDqnHRKOkrznfjUB63CScztMSd38&usqp=CAU', 'Carlos');
INSERT INTO PROFESORES (ID, FECHA_NACIMIENTO, SUELDO, CLASES_ID, NUSS, TELEFONO, APELLIDO_PROFESOR, DNI, EMAIL, FOTO_PROFESOR, NOMBRE_PROFESOR) VALUES (3, '1982-11-05', 2300.00, NULL, '11223344', '600555444', 'Fernández', '34567890C', 'lucia.fernandez@example.com', 'https://c.superprof.com/i/m/12311634/600/20230912190530/12311634.webp', 'Lucía');

INSERT INTO CLASES (ID, PROFESOR_ID, NOMBRE_CLASE) VALUES (1, 1, '3 años');
INSERT INTO CLASES (ID, PROFESOR_ID, NOMBRE_CLASE) VALUES (2, 2, '4 años');
INSERT INTO CLASES (ID, PROFESOR_ID, NOMBRE_CLASE) VALUES (3, 3, '5 años');

UPDATE PROFESORES SET CLASES_ID = 1 WHERE ID = 1;
UPDATE PROFESORES SET CLASES_ID = 2 WHERE ID = 2;
UPDATE PROFESORES SET CLASES_ID = 3 WHERE ID = 3;

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (1, '2019-03-15', 1, 1, 1, '600111222', 'Martínez', '45678901A', 'ana.martinez.parent@example.com', 'https://www.eldivinopastor.com/wp-content/uploads/cuanto-tarda-un-nino-en-adaptarse-a-la-guarderia.jpg', 'Ana', '["gluten","lactosa"]');

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (2, '2020-07-22', 2, 2, 2, '600222333', 'Sánchez', '56789012B', 'juan.sanchez.parent@example.com', 'https://letsfamily.es/wp-content/uploads/2019/07/guarderia-1.jpg', 'Juan', '["cacahuete"]');

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (3, '2018-11-30', 3, 3, 3, '600333444', 'López', '67890123C', 'maria.lopez.parent@example.com', 'https://guarderiajardilin.com/wp-content/uploads/2019/02/nina-guarderia.png', 'María', '["polen","levadura"]');

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (4, '2019-05-10', 1, 1, 1, '600444555', 'García', '78901234D', 'laura.garcia.parent@example.com', 'https://www.dzoom.org.es/wp-content/uploads/2019/03/5consejos-fotos-peques_portada-810x540.jpg', 'Laura', '["lactosa"]');

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (5, '2020-01-15', 2, 2, 2, '600555666', 'Torres', '89012345E', 'miguel.torres.parent@example.com', 'https://i.blogs.es/40fa63/nino-jugando/450_1000.jpg', 'Miguel', '[]');

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (6, '2018-09-12', 3, 3, 3, '600666777', 'Vega', '90123456F', 'sara.vega.parent@example.com', 'https://www.dzoom.org.es/wp-content/uploads/2019/02/5consejos-fotos-peques_peque-posando-734x486.jpg', 'Sara', '["gluten"]');

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (7, '2019-03-22', 1, 1, 1, '600777888', 'Ramos', '01234567G', 'david.ramos.parent@example.com', 'https://st2.depositphotos.com/6644020/11561/i/450/depositphotos_115616536-stock-photo-little-boy-smiling.jpg', 'David', '[]');

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (8, '2020-06-18', 2, 2, 2, '600888999', 'Blanco', '12345678H', 'laia.blanco.parent@example.com', 'https://assets.oviahealth.com/wp-content/uploads/2021/04/article_101315.jpg', 'Laia', '["cacahuete"]');

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (9, '2018-12-02', 3, 3, 3, '600999000', 'Molina', '23456789I', 'andres.molina.parent@example.com', 'https://i.blogs.es/bc9084/pexels-poppy-martinez-571476080-31528535/500_333.jpeg', 'Andrés', '[]');

INSERT INTO ALUMNOS (ID, FECHA_NACIMIENTO, ALUMNOS_ID, CLASES_ID, PROFESOR_ID, TELEFONO_CONTACTO, APELLIDO_ALUMNO, DNI, EMAIL_CONTACTO, FOTO_ALUMNO, NOMBRE_ALUMNO, ALERGIAS) VALUES (10, '2019-08-05', 1, 1, 1, '600111000', 'Morales', '34567890J', 'clara.morales.parent@example.com', 'https://st3.depositphotos.com/3584053/17886/i/450/depositphotos_178868438-stock-photo-happy-small-boy-on-green.jpg', 'Clara', '["lactosa"]');



INSERT INTO INCIDENCIAS (RESUELTA, ALUMNO_ID, FECHA, ID, PROFESOR_ID, DESCRIPCION, GRAVEDAD, OBSERVACIONES_RESOLUCION) VALUES (0, 1, '2025-10-23', 1, 2, 'Corte pequeño en la mano izquierda; limpiada y vendada en enfermería. Se avisó a la familia.', 'MEDIA', NULL);

INSERT INTO INCIDENCIAS (RESUELTA, ALUMNO_ID, FECHA, ID, PROFESOR_ID, DESCRIPCION, GRAVEDAD, OBSERVACIONES_RESOLUCION) VALUES (1, 2, '2025-10-24', 2, 1, 'Conflicto en el patio entre dos niños; mediación y seguimiento por el tutor.', 'BAJA', 'Padres informados; seguimiento en clase.');

INSERT INTO INCIDENCIAS (RESUELTA, ALUMNO_ID, FECHA, ID, PROFESOR_ID, DESCRIPCION, GRAVEDAD, OBSERVACIONES_RESOLUCION) VALUES (1, 1, '2025-10-24', 3, 3, 'Puerta del aula quedó entreabierta tras el recreo; cerrada y comprobado el mecanismo de cierre.', 'ALTA', 'Notificada dirección; revisado cierre y aplicada medida correctora.');


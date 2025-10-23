package com.GestionDeGuarderia.PastorMoleroGerman.Model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profesores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreProfesor;
    private String apellidoProfesor;
    private String email;
    private Long telefono;
    private String dni;
    private Long NUSS;
    private String fotoProfesor;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;


    @OneToOne
    @JoinColumn(name = "clases_id")
    private Clases clases;

    @OneToMany
    @JoinColumn(name = "alumnos_id")
    private List<Alumnos> listaAlumnos;

    @OneToMany
    @JoinColumn(name = "acitividad_id")
    private List<Actividades> listaActividades;

}

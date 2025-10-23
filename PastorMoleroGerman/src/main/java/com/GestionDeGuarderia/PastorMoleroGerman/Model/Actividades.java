package com.GestionDeGuarderia.PastorMoleroGerman.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreAct;
    private String descripcion;
    private LocalTime duracion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dia;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesores profesor;

    @ManyToMany
    @JoinTable(
            name = "actividades_alumnos",
            joinColumns = @JoinColumn(name = "actividad_id"),
            inverseJoinColumns = @JoinColumn(name = "alumno_id")
    )
    @ToString.Exclude
    private List<Alumnos> listaAlumnos;


}

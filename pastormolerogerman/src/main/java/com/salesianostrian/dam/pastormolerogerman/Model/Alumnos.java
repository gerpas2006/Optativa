package com.salesianostrian.dam.pastormolerogerman.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alumnos {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreAlumno;
    private String apellidoAlumno;
    private String emailContacto;
    private Long telefonoContacto;
    private String dni;
    private String fotoAlumno;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    private List<String> alergias;


    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesores profesor;

    @ManyToOne
    @JoinColumn(name = "clases_id")
    private Clases clases;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
        private List<Incidencias> incidencias;
}

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
    private double sueldo;
    private String fotoProfesor;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;


    @OneToOne
    @JoinColumn(name = "clases_id")
    private Clases clases;


}

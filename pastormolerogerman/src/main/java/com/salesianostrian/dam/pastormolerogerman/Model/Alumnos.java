package com.salesianostrian.dam.pastormolerogerman.Model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Alumnos {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreAlumno;
    private String apellidoAlumno;
    private String emailContacto;
    private Long telefonoContacto;
    private String dni;

    @Lob
    private String fotoAlumno;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    private List<String> alergias;

    @ManyToOne
    @JoinColumn(name = "clases_id")
    private Clases clases;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL)
    private List<Incidencias> incidencias;

}

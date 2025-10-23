package com.GestionDeGuarderia.PastorMoleroGerman.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Clases {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreClase;


    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesores profesores;

    @OneToMany(mappedBy = "clases", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Alumnos> listaAlumnos;
}

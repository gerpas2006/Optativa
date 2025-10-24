package com.salesianostrian.dam.pastormolerogerman.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Clases {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreClase;


    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesores profesores;

    @OneToMany(mappedBy = "clases", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Alumnos> listaAlumnos;
}

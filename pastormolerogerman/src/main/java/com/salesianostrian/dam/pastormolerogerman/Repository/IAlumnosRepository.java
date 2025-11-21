package com.salesianostrian.dam.pastormolerogerman.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;

@Repository
public interface IAlumnosRepository extends JpaRepository<Alumnos,Long> {


    public Alumnos findByDniContainingIgnoreCase(String dni);


    boolean existsByDni(String dni);

    boolean existsByDniAndIdNot(String dni, Long id);

}

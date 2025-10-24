package com.salesianostrian.dam.pastormolerogerman.Repository;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAlumnosRepository extends JpaRepository<Alumnos,Long> {



}

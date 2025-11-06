package com.salesianostrian.dam.pastormolerogerman.Repository;

import com.salesianostrian.dam.pastormolerogerman.Model.Incidencias;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IIncidenciasRepository extends JpaRepository<Incidencias, Long> {

    public List<Incidencias> findByResueltaFalse();
    public List<Incidencias> findByResueltaTrue();

}

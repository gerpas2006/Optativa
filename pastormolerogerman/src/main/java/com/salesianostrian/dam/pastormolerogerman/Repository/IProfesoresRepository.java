package com.salesianostrian.dam.pastormolerogerman.Repository;

import com.salesianostrian.dam.pastormolerogerman.Model.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProfesoresRepository extends JpaRepository<Profesores,Long> {

    public List<Profesores> findByDniContainingIgnoreCase(String dni);

    boolean existsByDni(String dni);

    boolean existsByDniAndIdNot(String dni, Long id);
}

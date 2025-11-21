package com.salesianostrian.dam.pastormolerogerman.Repository;


import com.salesianostrian.dam.pastormolerogerman.Model.Clases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClasesRepository extends JpaRepository<Clases,Long> {

    public List<Clases> findByNombreClaseContainingIgnoreCase(String nombreClase);

    boolean existsByNombreClase(String nombreClase);

    boolean existsByNombreClaseAndIdNot(String nombreClase, Long id);

}

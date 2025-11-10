package com.salesianostrian.dam.pastormolerogerman.Repository;

import com.salesianostrian.dam.pastormolerogerman.Model.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesoresRepository extends JpaRepository<Profesores,Long> {

    public Profesores findByDniContainingIgnoreCase(String dni);


}

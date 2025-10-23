package com.salesianostrian.dam.pastormolerogerman.Repository;


import com.salesianostrian.dam.pastormolerogerman.Model.Clases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClasesRepository extends JpaRepository<Clases,Long> {
}

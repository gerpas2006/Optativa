package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Incidencias;
import com.salesianostrian.dam.pastormolerogerman.Model.Profesores;
import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfesoresService {

    private final IProfesoresRepository profesoresRepository;

    public Long contarProfesores(){
        return profesoresRepository.count();
    }

    public List<Profesores> listarProfesores(){
        return profesoresRepository.findAll();
    }

    public List<Profesores> mostrarAlgunasIncidencias(){
        int numeroDeSalidas = 5;
        List<Profesores> listado = listarProfesores();
        return listado.stream().limit(numeroDeSalidas).toList();

    }
}

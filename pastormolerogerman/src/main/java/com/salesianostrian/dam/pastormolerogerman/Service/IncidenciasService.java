package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Incidencias;
import com.salesianostrian.dam.pastormolerogerman.Repository.IIncidenciasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IncidenciasService {

    private final IIncidenciasRepository incidenciasRepository;

    public Long contarIncidencias(){
        return incidenciasRepository.count();
    }

    public List<Incidencias> devolverTodasLasIncidencias(){
        return incidenciasRepository.findAll();
    }

    public List<Incidencias> mostrarUnNumeroDeIncidencias(){
        int numeroDeSalidas= 5;
        List<Incidencias> listado = devolverTodasLasIncidencias();
        return listado.stream().limit(numeroDeSalidas).toList();
    }
}

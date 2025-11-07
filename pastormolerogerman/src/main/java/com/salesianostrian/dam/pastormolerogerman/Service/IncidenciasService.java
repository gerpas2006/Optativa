package com.salesianostrian.dam.pastormolerogerman.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Incidencias;
import com.salesianostrian.dam.pastormolerogerman.Repository.IIncidenciasRepository;

import lombok.RequiredArgsConstructor;

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

    public List<Incidencias> devolverLasResueltas(){
        return incidenciasRepository.findByResueltaTrue();
    }
    
    public List<Incidencias> devolverLasNoResueltas(){
        return incidenciasRepository.findByResueltaFalse();
    }

    public void agregarIncidencia(Incidencias incidencias){
        incidenciasRepository.save(incidencias);
    }

    public void editarIncidencia(Incidencias incidencias){
        incidenciasRepository.save(incidencias);
    }

    public Incidencias buscarPorId(Long id){
        return incidenciasRepository.findById(id).orElse(null);
    }
}

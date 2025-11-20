package com.salesianostrian.dam.pastormolerogerman.Service;

import java.util.List;
import java.util.stream.Collector;

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

    public double mediaDeInicdenciasResueltas() {
        List<Incidencias> todas = devolverTodasLasIncidencias();
        double resueltas =0;
        if(todas.isEmpty()) {
            return 0.0;
        }
        resueltas = todas.stream().filter(i -> i.isResuelta()).count();
        return (resueltas / todas.size()) * 100;
    }

    public double porcentajeDeIncidenciasNoResueltas() {
        List<Incidencias> todas = devolverTodasLasIncidencias();
        double noResueltas = 0;
        if(todas.isEmpty()) {
            return 0.0;
        }
        noResueltas = todas.stream().filter(i -> !i.isResuelta()).count();
        return (noResueltas / (double) todas.size()) * 100.0;
    }
}

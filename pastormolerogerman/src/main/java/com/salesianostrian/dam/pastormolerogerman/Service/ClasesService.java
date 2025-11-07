package com.salesianostrian.dam.pastormolerogerman.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;
import com.salesianostrian.dam.pastormolerogerman.Model.Clases;
import com.salesianostrian.dam.pastormolerogerman.Model.Profesores;
import com.salesianostrian.dam.pastormolerogerman.Repository.IClasesRepository;
import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClasesService {

    private final IClasesRepository clasesRepository;
    private final IProfesoresRepository iProfesoresRepository;


    public Long contarClases(){
        return clasesRepository.count();
    }

    public List<Clases> listarClases(){
        return clasesRepository.findAll();
    }

    public void eliminarClase(Long id){
        Clases c = clasesRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("No se ha encontrado la clase")
        );

        for (Alumnos a : c.getListaAlumnos()){
            if(a.getClases().getId()==id){
                a.setClases(null);
            }
        }
        
        if(c.getProfesores() != null){
            c.getProfesores().setClases(null);
        }
        
        clasesRepository.delete(c);
    }

    public List<Clases> buscarUnaClase(String nombreClase){
        return clasesRepository.findByNombreClaseContainingIgnoreCase(nombreClase);
    }

    public void agregarClase(Clases clases){
        clasesRepository.save(clases);
    }

    public void editarClase(Clases clases){
        Clases claseExistente = clasesRepository.findById(clases.getId()).orElseThrow(
            () -> new EntityNotFoundException("No se ha encontrado la clase")
        );
        
        claseExistente.setNombreClase(clases.getNombreClase());

        if(clases.getProfesores() != null){
            Profesores profesor = iProfesoresRepository.findById(clases.getProfesores().getId()).orElse(null);
                if(claseExistente.getProfesores() != null){
                    claseExistente.getProfesores().setClases(null);
                }
                // Asignar el nuevo profesor
                claseExistente.setProfesores(profesor);
                profesor.setClases(claseExistente);
            }
            clasesRepository.save(claseExistente);
        }

    public Clases buscarPorId(Long id){
        return clasesRepository.findById(id).orElse(null);
    }


}

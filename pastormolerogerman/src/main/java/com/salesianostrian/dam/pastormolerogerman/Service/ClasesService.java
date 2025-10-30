package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;
import com.salesianostrian.dam.pastormolerogerman.Model.Clases;
import com.salesianostrian.dam.pastormolerogerman.Repository.IClasesRepository;
import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClasesService {

    private final IClasesRepository clasesRepository;
    private final AlumnosService alumnosService;
    private final ProfesoresService profesoresService;
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
        c.getProfesores().setClases(null);
        clasesRepository.delete(c);
    }

    public Clases buscarUnaClase(String nombreClase){
        List<Clases> lista = listarClases();
        return lista.stream().filter(clases -> clases.getNombreClase().equalsIgnoreCase(nombreClase)).findFirst().orElse(null);
    }

    public void agregarClase(Clases clases){
        clasesRepository.save(clases);
    }

    public void editarClase(Clases clases){
        clasesRepository.save(clases);
    }

    public Clases buscarPorId(Long id){
        return clasesRepository.findById(id).orElse(null);
    }


}

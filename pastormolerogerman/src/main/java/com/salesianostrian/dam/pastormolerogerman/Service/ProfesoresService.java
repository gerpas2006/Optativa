package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;
import com.salesianostrian.dam.pastormolerogerman.Model.Clases;
import com.salesianostrian.dam.pastormolerogerman.Model.Incidencias;
import com.salesianostrian.dam.pastormolerogerman.Model.Profesores;
import com.salesianostrian.dam.pastormolerogerman.Repository.IClasesRepository;
import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfesoresService {

    private final IProfesoresRepository profesoresRepository;
    private final IClasesRepository clasesRepository;

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

    public List<Profesores> mostrarLosQueNoTienenCLases(){
        List<Profesores> lista= listarProfesores();
        return lista.stream().filter(profesores-> profesores.getClases()==null).toList();
    }

    public Profesores buscarPorId(Long id) {
        return profesoresRepository.findById(id).orElse(null);
    }

    public void eliminarProfesor(Long id){
        Profesores p = profesoresRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("No se ha encontrado la clase")
        );

        if(p.getClases() != null){
            p.getClases().setProfesores(null);
        }
        profesoresRepository.delete(p);

    }

    public void agregarProfesor(Profesores profesores){
        profesoresRepository.save(profesores);
    }

    public void editarProfesor(Profesores profesores){
        profesoresRepository.save(profesores);
    }

}

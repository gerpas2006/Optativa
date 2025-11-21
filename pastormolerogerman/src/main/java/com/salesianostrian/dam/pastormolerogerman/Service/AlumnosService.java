package com.salesianostrian.dam.pastormolerogerman.Service;

import java.util.List;

import com.salesianostrian.dam.pastormolerogerman.error.AlumnoErrorArgumentException;
import org.springframework.stereotype.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;
import com.salesianostrian.dam.pastormolerogerman.Repository.IAlumnosRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlumnosService {


    private final IAlumnosRepository alumnosRepository;

    public Long contarAlumnos(){
        return alumnosRepository.count();
    }

    public List<Alumnos> listarAlumnos(){
        return alumnosRepository.findAll();
    }

    public void eliminarAlumno(Long id){
        alumnosRepository.deleteById(id);
    }

    public Alumnos buscarPorDni(String dni){
        return alumnosRepository.findByDniContainingIgnoreCase(dni);
    }

    public void agregarAlumno(Alumnos alumnos){



        alumnosRepository.save(alumnos);
    }

    public void editarAlumno(Alumnos alumnos){

        if(alumnosRepository.existsByDni(alumnos.getDni())) throw new AlumnoErrorArgumentException("Error al editar el alumno");

        alumnosRepository.save(alumnos);
    }

    public List<Alumnos> mostrarSegunSuClase(Long clase_id){
        List<Alumnos> lista = listarAlumnos();


        return lista.stream().filter(alumnos -> alumnos.getClases() != null && alumnos.getClases().getId()==clase_id).toList();
    }

}

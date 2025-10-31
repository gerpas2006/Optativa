package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;
import com.salesianostrian.dam.pastormolerogerman.Model.Clases;
import com.salesianostrian.dam.pastormolerogerman.Repository.IAlumnosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlumnosService {


    private final IAlumnosRepository alumnosRepository;

    public List<Alumnos> listarTodos(){
        return alumnosRepository.findAll();
    }

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
        List<Alumnos> lista = listarAlumnos();
        return lista.stream().filter(alumno -> alumno.getDni().equalsIgnoreCase(dni)).findFirst().orElse(null);
    }

    public void agregarAlumno(Alumnos alumnos){
        // Asignar el profesor de la clase seleccionada
        Clases clases = alumnos.getClases();
        if (alumnos.getClases() != null) {
            alumnos.setClases(alumnos.getClases());
            clases.getListaAlumnos().add(alumnos);
        }
        alumnosRepository.save(alumnos);
    }

    public void editarAlumno(Alumnos alumnos){
        alumnosRepository.save(alumnos);
    }

}

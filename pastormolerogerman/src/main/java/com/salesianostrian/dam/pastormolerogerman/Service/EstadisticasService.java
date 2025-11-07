package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;
import com.salesianostrian.dam.pastormolerogerman.Model.Profesores;
import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class EstadisticasService {

    private final ProfesoresService profesoresService;
    private final AlumnosService alumnosService;


    public double gastoMedioDeSueldos(){
        List<Profesores> profesores = profesoresService.listarProfesores();
        double suma = 0;
        suma = profesores.stream().mapToDouble(Profesores::getSueldo).sum();
        return suma/profesores.size();
    }

    public double sueldoMasAlto(){
        List<Profesores> profesores = profesoresService.listarProfesores();
        return profesores.stream().mapToDouble(Profesores::getSueldo).max().orElse(0.0);
    }

    public double sueldoMasBajo(){
        List<Profesores> profesores = profesoresService.listarProfesores();
        return profesores.stream().mapToDouble(Profesores::getSueldo).min().orElse(0.0);
    }

    public List<Alumnos> alumnosMasGrande(){
        List<Alumnos> listAlum = alumnosService.listarAlumnos();
        listAlum = listAlum.stream().sorted(Comparator.comparing(Alumnos::getFechaNacimiento)).collect(Collectors.toList());
        List<Alumnos> guardarAlumno = new ArrayList<>();
        guardarAlumno.add(listAlum.getFirst());
        listAlum.forEach(a -> {
            if (a.getFechaNacimiento()== guardarAlumno.getFirst().getFechaNacimiento()){
                guardarAlumno.add(a);
            }
        });
        return guardarAlumno;
    }

    public List<Profesores> profesorMasGrande(){
        List<Profesores> listProfesores = profesoresService.listarProfesores();
        listProfesores = listProfesores.stream().sorted(Comparator.comparing(Profesores::getFechaNacimiento)).collect(Collectors.toList());
        List<Profesores> guardarProfesor= new ArrayList<>();
        guardarProfesor.add(listProfesores.getFirst());
        listProfesores.forEach(p -> {
            if (p.getFechaNacimiento() == guardarProfesor.getFirst().getFechaNacimiento()){
                guardarProfesor.add(p);
            }
        });
        return guardarProfesor;
    }



}

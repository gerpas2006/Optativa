package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;
import com.salesianostrian.dam.pastormolerogerman.Model.Clases;
import com.salesianostrian.dam.pastormolerogerman.Model.Profesores;
import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class EstadisticasService {

    private final ProfesoresService profesoresService;
    private final AlumnosService alumnosService;
    private final ClasesService clasesService;


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

    public List<Alumnos> alumnosMasGrande() {
        List<Alumnos> listAlum = alumnosService.listarAlumnos();
        LocalDate fechaMasAntigua = listAlum.stream()
                .map(Alumnos::getFechaNacimiento)
                .min(LocalDate::compareTo)
                .orElse(null);
        return listAlum.stream()
                .filter(a -> a.getFechaNacimiento().equals(fechaMasAntigua))
                .collect(Collectors.toList());
    }

    public List<Profesores> profesorMasGrande(){
        List<Profesores> listProfesores = profesoresService.listarProfesores();
        LocalDate fechaMasAntigua = listProfesores
                .stream()
                .map(Profesores::getFechaNacimiento)
                .min(LocalDate::compareTo)
                .orElse(null);

        return listProfesores.stream()
                .filter(p -> p.getFechaNacimiento().equals(fechaMasAntigua))
                .collect(Collectors.toList());
    }

    public List<Alumnos> alumnoMasPequeno(){
        List<Alumnos> listarAlumnos = alumnosService.listarAlumnos();

        LocalDate fechaMasChica = listarAlumnos.stream()
                .map(Alumnos::getFechaNacimiento)
                .max(LocalDate::compareTo).orElse(null);
        return listarAlumnos.stream()
                .filter(a -> a.getFechaNacimiento()
                        .equals(fechaMasChica))
                .collect(Collectors.toList());
    }

    public List<Profesores> profesorMasPequeno(){
        List<Profesores> listarProfesores= profesoresService.listarProfesores();

        LocalDate fechaMasChica = listarProfesores.stream()
                .map(Profesores::getFechaNacimiento)
                .max(LocalDate::compareTo)
                .orElse(null);
        return listarProfesores.stream()
                .filter(p -> p.getFechaNacimiento().equals(fechaMasChica))
                .collect(Collectors.toList());
    }

    public List<Profesores> profesoresQueMasCobran(){
        List<Profesores> profesores = profesoresService.listarProfesores();

        return profesores.stream().sorted(Comparator.comparing(Profesores::getSueldo)).limit(5).toList().reversed();
    }

    public double mediaDeAlumnosPorClase(){
        List<Clases> clases = clasesService.listarClases();
        double suma = 0;
        suma = clases.stream().mapToDouble(c -> c.getListaAlumnos().size()).sum();
        return suma/clases.size();
    }


}

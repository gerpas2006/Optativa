package com.salesianostrian.dam.pastormolerogerman.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Profesores;
import com.salesianostrian.dam.pastormolerogerman.Repository.IClasesRepository;
import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

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

    public Profesores buscarPorDni(String dni){
        return profesoresRepository.findByDniContainingIgnoreCase(dni);
    }

    public Double sueldoConPlusPorAnosTrabajados(Long id){
        Profesores profesor = buscarPorId(id);
        double porcentaje = 15;
        int aniosTrabajados = 20;
        int anioActual = LocalDate.now().getYear();
        int anioInc = profesor.getFechaIncorporacion().getYear();
        int diferencia = anioActual - anioInc;
        if (diferencia>aniosTrabajados) {
            return (profesor.getSueldo()*porcentaje)/100;
        }else {
            return 0.0;
        }
    }

    public Double sueldoSinIrpf(Long id) {
        Profesores p = buscarPorId(id);
        double sueldoMensualBruto = p.getSueldo();
        int mesesAnio = 12;
        double sueldoAnualBruto = sueldoMensualBruto * mesesAnio;
        double irpfAplicable = 0.0;

        if (sueldoAnualBruto < 12.450) {
            irpfAplicable = 0.0;
        } else if (sueldoAnualBruto >= 12.450 && sueldoAnualBruto < 20.200) {
            irpfAplicable = 0.19;
        } else if (sueldoAnualBruto >= 20.200 && sueldoAnualBruto < 35.200) {
            irpfAplicable = 0.24;
        } else if (sueldoAnualBruto >= 35.200 && sueldoAnualBruto < 60.000) {
            irpfAplicable = 0.30;
        } else {
            irpfAplicable = 0.37; 
        }

        double retencionMensual = sueldoMensualBruto * irpfAplicable;
        double sueldoMensualNeto = sueldoMensualBruto - retencionMensual;

        return sueldoMensualNeto;
    }
}

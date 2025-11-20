package com.salesianostrian.dam.pastormolerogerman.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostrian.dam.pastormolerogerman.Service.EstadisticasService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class EstadisticasController {

    private final EstadisticasService estadisticasService;

    @GetMapping("/estadisticas")
    public String mostrarEstadisticasProfesores(Model model){
        model.addAttribute("sueldoMasAlto", estadisticasService.sueldoMasAlto());
        model.addAttribute("sueldoMasBajo", estadisticasService.sueldoMasBajo());
        model.addAttribute("mediaDeSueldos", estadisticasService.gastoMedioDeSueldos());
        model.addAttribute("alumnaMasGrande", estadisticasService.alumnosMasGrande());
        model.addAttribute("profesorMasGrande", estadisticasService.profesorMasGrande());
        model.addAttribute("profesorMasChico", estadisticasService.profesorMasPequeno());
        model.addAttribute("alumnoMasChico", estadisticasService.alumnoMasPequeno());
        model.addAttribute("profesoresQueMasCobran", estadisticasService.profesoresQueMasCobran());
        model.addAttribute("mediaDeAlumnosPorClase", estadisticasService.mediaDeAlumnosPorClase());
        model.addAttribute("alumnosConMasIncidencias", estadisticasService.alumnosConMasIncidencias());
        return "estadisticas";
    }
}

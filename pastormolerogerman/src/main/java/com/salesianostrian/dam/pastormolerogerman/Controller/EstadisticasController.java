package com.salesianostrian.dam.pastormolerogerman.Controller;

import com.salesianostrian.dam.pastormolerogerman.Service.EstadisticasService;
import com.salesianostrian.dam.pastormolerogerman.Service.ProfesoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        return "estadisticas";
    }
}

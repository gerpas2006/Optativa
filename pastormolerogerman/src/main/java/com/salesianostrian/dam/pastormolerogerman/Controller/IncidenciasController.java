package com.salesianostrian.dam.pastormolerogerman.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostrian.dam.pastormolerogerman.Service.IncidenciasService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class IncidenciasController {

    private final IncidenciasService incidenciasService;

    @GetMapping("/incidencias")
    public String listarIncidencias(Model model){
        model.addAttribute("incidencias", incidenciasService.devolverTodasLasIncidencias());
        return "incidencias";
    }

    @GetMapping("/incidencia/filtrar/resueltas")
    public String mostrarResueltas(Model model){
        model.addAttribute("incidencias", incidenciasService.devolverLasResueltas());
        return "incidencias";
    }

    @GetMapping("/incidencia/filtrar/noresueltas")
    public String mostrarNoResueltas(Model model){
        model.addAttribute("incidencias", incidenciasService.devolverLasNoResueltas());
        return "incidencias";
    }
}

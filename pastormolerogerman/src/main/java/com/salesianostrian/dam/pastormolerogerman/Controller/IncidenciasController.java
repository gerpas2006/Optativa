package com.salesianostrian.dam.pastormolerogerman.Controller;

import com.salesianostrian.dam.pastormolerogerman.Model.Incidencias;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostrian.dam.pastormolerogerman.Service.IncidenciasService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class IncidenciasController {

    private final IncidenciasService incidenciasService;

    @GetMapping("/incidencias")
    public String listarIncidencias(Model model) {
        model.addAttribute("incidencias", incidenciasService.devolverTodasLasIncidencias());
        model.addAttribute("mediaResueltas", incidenciasService.mediaDeInicdenciasResueltas());
        model.addAttribute("mediaNoResueltas", incidenciasService.porcentajeDeIncidenciasNoResueltas());
        return "incidencias";
    }

    @GetMapping("/incidencia/filtrar/resueltas")
    public String mostrarResueltas(Model model) {
        model.addAttribute("incidencias", incidenciasService.devolverLasResueltas());
        model.addAttribute("mediaResueltas", incidenciasService.mediaDeInicdenciasResueltas());
        model.addAttribute("mediaNoResueltas", incidenciasService.porcentajeDeIncidenciasNoResueltas());
        return "incidencias";
    }

    @GetMapping("/incidencia/filtrar/noresueltas")
    public String mostrarNoResueltas(Model model) {
        model.addAttribute("incidencias", incidenciasService.devolverLasNoResueltas());
        model.addAttribute("mediaResueltas", incidenciasService.mediaDeInicdenciasResueltas());
        model.addAttribute("mediaNoResueltas", incidenciasService.porcentajeDeIncidenciasNoResueltas());
        return "incidencias";
    }

    @GetMapping("/incidencias/agregar")
    public String agregarIncidencia(Model model) {
        model.addAttribute("incidencia", new Incidencias());
        return "formularioIncidencia";
    }

    @PostMapping("/incidencias/agregar")
    public String agregarIncidencia(@ModelAttribute Incidencias incidencias) {
        incidenciasService.agregarIncidencia(incidencias);
        return "redirect:/incidencias";
    }

    @GetMapping("/incidencias/editar/{id}")
    public String editarIncidencia(@PathVariable Long id, Model model) {
        model.addAttribute("incidencia", incidenciasService.buscarPorId(id));
        return "formularioIncidencia";
    }

    @PostMapping("/incidencias/editar")
    public String editarIncidencia(@ModelAttribute Incidencias incidencias) {
        incidenciasService.editarIncidencia(incidencias);
        return "redirect:/incidencias";
    }
}

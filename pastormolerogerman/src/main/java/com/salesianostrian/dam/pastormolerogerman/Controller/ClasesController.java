package com.salesianostrian.dam.pastormolerogerman.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostrian.dam.pastormolerogerman.Model.Clases;
import com.salesianostrian.dam.pastormolerogerman.Service.ClasesService;
import com.salesianostrian.dam.pastormolerogerman.Service.ProfesoresService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ClasesController {

    private final ClasesService clasesService;
    private final ProfesoresService profesoresService;

    @GetMapping("/clases")
    public String listarClases(Model model){
        model.addAttribute("clases", clasesService.listarClases());
        model.addAttribute("profesores", profesoresService.listarProfesores());
        return "clases";
    }

    @PostMapping("clases/eliminar/{id}")
    public String eliminarClase(@PathVariable Long id){
        clasesService.eliminarClase(id);
        return "redirect:/clases";
    }

    @GetMapping("/clases/buscada")
    public String buscarUnaClase(String nombreClase,Model model){
        model.addAttribute("claseBuscada", clasesService.buscarUnaClase(nombreClase));
        model.addAttribute("profesores", profesoresService.listarProfesores());
        return "claseBuscada";
    }

    @GetMapping("/clases/agregar")
    public String agragarClase(Model model){
        model.addAttribute("clases", new Clases());
        return "formularioClases";
    }

    @PostMapping("/clases/agregar")
    public String agregarClase(@ModelAttribute Clases clases){
        clasesService.agregarClase(clases);
        return "redirect:/clases";
    }

    @GetMapping("/clases/editar/{id}")
    public String editarClase(@PathVariable Long id,Model model){
        model.addAttribute("clases",clasesService.buscarPorId(id));
        model.addAttribute("profesores",profesoresService.listarProfesores());
        return "formularioClases";
    }

    @PostMapping("/clases/editar")
    public String editarClase(@ModelAttribute Clases clases){
        clasesService.editarClase(clases);
        return "redirect:/clases";
    }
}

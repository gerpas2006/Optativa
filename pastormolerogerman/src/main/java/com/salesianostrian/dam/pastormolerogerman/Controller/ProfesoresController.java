package com.salesianostrian.dam.pastormolerogerman.Controller;

import com.salesianostrian.dam.pastormolerogerman.Model.Profesores;
import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;
import com.salesianostrian.dam.pastormolerogerman.Service.AlumnosService;
import com.salesianostrian.dam.pastormolerogerman.Service.ClasesService;
import com.salesianostrian.dam.pastormolerogerman.Service.ProfesoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProfesoresController {

    private final ProfesoresService profesoresService;
    private final ClasesService clasesService;

    @GetMapping("/profesores")
    public String listarProfesores(Model model){
        model.addAttribute("profesores", profesoresService.listarProfesores());
        model.addAttribute("clases", clasesService.listarClases());
        return "profesores";
    }

    @PostMapping("/profesores/eliminar/{id}")
    public String eliminarProfesor(@PathVariable Long id){
        profesoresService.eliminarProfesor(id);
        return "redirect:/profesores";
    }

    @GetMapping("/profesores/guardar")
    public String agregarProfesor(Model model){
        model.addAttribute("profesor", new Profesores());
        return "formularioProfesor";
    }

    @PostMapping("/profesores/guardar")
    public String agregarProfesor(@ModelAttribute Profesores profesores){
        profesoresService.agregarProfesor(profesores);
        return "redirect:/profesores";
    }
}

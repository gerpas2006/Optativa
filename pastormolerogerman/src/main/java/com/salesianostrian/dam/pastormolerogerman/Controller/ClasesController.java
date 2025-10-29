package com.salesianostrian.dam.pastormolerogerman.Controller;

import com.salesianostrian.dam.pastormolerogerman.Service.AlumnosService;
import com.salesianostrian.dam.pastormolerogerman.Service.ClasesService;
import com.salesianostrian.dam.pastormolerogerman.Service.ProfesoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ClasesController {

    private final ClasesService clasesService;
    private final ProfesoresService profesoresService;
    private final AlumnosService alumnosService;


    @GetMapping("/clases")
    public String listarClases(Model model){
        model.addAttribute("clases", clasesService.listarClases());
        model.addAttribute("profesores", profesoresService.listarProfesores());
        model.addAttribute("alumnos", alumnosService.listarAlumnos());
        return "clases";
    }
}

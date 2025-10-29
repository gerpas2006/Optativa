package com.salesianostrian.dam.pastormolerogerman.Controller;

import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;
import com.salesianostrian.dam.pastormolerogerman.Service.AlumnosService;
import com.salesianostrian.dam.pastormolerogerman.Service.ClasesService;
import com.salesianostrian.dam.pastormolerogerman.Service.ProfesoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@RequiredArgsConstructor
public class ProfesoresController {

    private final ProfesoresService profesoresService;
    private final AlumnosService alumnosService;
    private final ClasesService clasesService;

    @GetMapping("/profesores")
    public String listarProfesores(Model model){
        model.addAttribute("profesores", profesoresService.listarProfesores());
        model.addAttribute("clases", clasesService.listarClases());
        model.addAttribute("alumnos", alumnosService.listarAlumnos());
        return "profesores";
    }
}
